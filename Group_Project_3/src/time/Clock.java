package time;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Clock is a runnable, thread based clock that notifies its listeners
 * every second.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class Clock implements Runnable {
    private Thread thread = new Thread(this);
    private static Clock clock;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
	 * Adds a listener to the ticking clock.
	 * 
	 * @param listener
	 * 			the object that is listening to the clock
	 */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
	 * Removes a listener from the ticking clock.
	 * 
	 * @param listener
	 * 			the object that will no longer listen
	 */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.removePropertyChangeListener(listener);
    }

    /**
	 * Private constructor, it starts the clock ticking.
	 */
    private Clock() {
        thread.start();
    }

    /**
	 * Gets the clock instance
	 * 
	 * @return clock
	 * 			the clock singleton
	 */
    public static Clock instance() {
        if (clock == null) {
            clock = new Clock();
        }
        return clock;
    }

    /**
	 * The run method for the clock, notifies all
	 * of its listeners each second.
	 */
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                this.propertyChangeSupport.firePropertyChange(null, null, null);
            }
        } catch (InterruptedException e) {
        }
    }

}
