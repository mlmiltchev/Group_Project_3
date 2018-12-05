package main;

import states.VehicleOffState;
import states.VehicleState;

public class VehicleContext {
	public VehicleState currentState;
	// private VehicleDisplay display;
	private static VehicleContext instance;
	public static int speed;

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

	public void setDisplay(VehicleDisplay display) {
		display = this.display;
	}

	public void changeState(VehicleState state) {
		currentState.end();
		currentState = state;
		currentState.start();
	}
}
