package states;

import javafx.application.Platform;
import main.Notifiable;
import main.UserInterface;
import main.VehicleContext;
import time.Timer;

/**
 * VehicleBrakeState controls when the current state is
 * braking, it will slow the car if the brake is applied.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleBrakeState extends VehicleState implements Notifiable {
	private static VehicleBrakeState instance;
	private State state = State.BRAKING;
	private Timer timer;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleBrakeState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleBrakeState
	 * 			the singleton instance object
	 */
	public static VehicleBrakeState instance() {
		if (instance == null) {
			instance = new VehicleBrakeState();
		}
		return instance;
	}

	/**
	 * Sets the driveText to show that the vehicle is braking.
	 */
	@Override
	public void vehicleBrake() {
		UserInterface.driveText.setText("Brake is pressed");
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		vehicleBrake();
		timer = new Timer(this,false);
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
	 * When a second has passed update the speed to be 5 mph lower then current speed
	 * as the vehicle is braking.
	 */
	@Override
	public void timerTicked(int time) {
		Platform.runLater(new Runnable(){
			@Override
			public void run() {
				VehicleContext.instance().setSpeed(VehicleContext.instance().getSpeed()-5);			
			}
		});
	}
}
