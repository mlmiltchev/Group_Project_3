package main;

import states.VehicleOffState;
import states.VehicleState;

/**
 * VehicleContex is the main driver behind the states.
 * It holds the current state and transitions between states.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Mihail Miltchev
 * 
 */

public class VehicleContext {
	public VehicleState currentState;
	private static VehicleContext instance;
	private int speed = 0;

	/**
	 * Make it a singleton and starts the Vehicle in the OFF state per
	 * instruction.
	 */
	private VehicleContext() {
		instance = this;
		currentState = VehicleOffState.instance();
	}

	/**
	 * Return the instance
	 * 
	 * @return the object
	 */
	public static VehicleContext instance() {
		if (instance == null) {
			instance = new VehicleContext();
		}
		return instance;
	}
	
	/**
	 * Changes the state of the vehicle, ends the old state and starts the new one.
	 * 
	 * @param state
	 * 			the new state to transition to.
	 */
	public void changeState(VehicleState state) {
		currentState.end();
		currentState = state;
		currentState.start();
	}

	/**
	 * Return the vehicle speed
	 * 
	 * @return the speed of the vehicle
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Changes the speed of the vehicle.
	 * 
	 * @param mph
	 * 			the new mph to update the speed to.
	 */
	public void setSpeed(int mph) {
		speed = mph;
		UserInterface.updateSpeed(speed);
	}
}
