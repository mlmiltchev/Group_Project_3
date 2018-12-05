package time;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import main.Notifiable;
import main.VehicleContext;

public class Timer implements PropertyChangeListener {
    private int time;
    private Notifiable client;
    private boolean increase = false;

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

    public void stop() {
        Clock.instance().removePropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent arg0) {
    	if (time < 10 && increase) {
    		client.timerTicked(++time);
    	} else if (time > 0 && !increase) {
    		client.timerTicked(--time);
    	}
    }
}
