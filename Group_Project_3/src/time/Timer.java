package time;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import main.Notifiable;
import main.VehicleContext;

/**
 * Timer is a listener that uses the clock to notify its client
 * that the timer has ticked.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class Timer implements PropertyChangeListener {
    private int time;
    private Notifiable client;
    private boolean increase = false;
    
    /**
	 * Initializes Timer with the client and type, either count up or down.
	 * 
	 * @param client
	 * 			the client to notify of updates
	 * @param type
	 * 			the type of timer, true is count up and false is count down
	 */
    public Timer(Notifiable client, boolean type) {
        this.client = client;
        this.increase = type;
        if(VehicleContext.instance().getSpeed() == 0) {
        	this.time = 0;
        } else {
        	this.time = VehicleContext.instance().getSpeed()/5;
        }
        Clock.instance().addPropertyChangeListener(this);
    }

    /**
	 * Stops the timer
	 */
    public void stop() {
        Clock.instance().removePropertyChangeListener(this);
    }
    
    /**
	 * handles when the clock has changed, signals the timer has
	 * ticked if its right to do so.
	 * 
	 * @param event
	 * 			property change event
	 */
    @Override
    public void propertyChange(PropertyChangeEvent event) {
    	if (time < 10 && increase) {
    		client.timerTicked(++time);
    	} else if (time > 0 && !increase) {
    		client.timerTicked(--time);
    	}
    }
}
