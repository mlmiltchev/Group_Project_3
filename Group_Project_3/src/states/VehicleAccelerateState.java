package states;

import main.UserInterface;
import main.VehicleContext;
import time.Timer;
import javafx.application.Platform;
import main.Notifiable;

/**
 * VehicleAcclerateState handles the state for acceleration,
 * it initializes the speed to increase from 0-50 mph.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleAccelerateState extends VehicleState implements Notifiable {
	private static VehicleAccelerateState instance;
	private State state = State.ACCELERATING;
	private Timer timer;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleAccelerateState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleAccelerateState
	 * 			the singleton instance object
	 */
	public static VehicleAccelerateState instance() {
		if (instance == null) {
			instance = new VehicleAccelerateState();
		}
		return instance;
	}

	/**
	 * Sets the driveText to show that the vehicle is accelerating.
	 */
	@Override
	public void vehicleAccelerate() {
		UserInterface.driveText.setText("Accelerator is pressed");
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		vehicleAccelerate();
		timer = new Timer(this,true);
	}

	/**
	 * Runs when the state is exited.
	 */
	@Override
	public void end() {
		timer.stop();
		timer = null;
	}

	/**
	 * Gets the current State.
	 * 
	 * @return State
	 * 			returns the state
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * When a second has passed update the speed to be 5 mph higher then current speed
	 * as the vehicle is accelerating.
	 */
	@Override
	public void timerTicked(int time) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				VehicleContext.instance().setSpeed(VehicleContext.instance().getSpeed()+5);	
			}
		});
	}
}