package states;

import main.UserInterface;

/**
 * VehicleOffState handles the vehicle when the vehicle gets
 * turned off.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleOffState extends VehicleState {
	private static VehicleOffState instance;
	private State state = State.OFF;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleOffState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleOffState
	 * 			the singleton instance object
	 */
	public static VehicleOffState instance() {
		if (instance == null) {
			instance = new VehicleOffState();
		}
		return instance;
	}

	/**
	 * Sets the powerText to show that the vehicle is off.
	 */
	@Override
	public void vehicleOff() {
		/*
		 * In order for a vehicle to be PARKED to enter this state. It must
		 * already be stopped. No need to check again.
		 */
		UserInterface.powerText.setText("Vehicle is Off");
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		vehicleOff();

	}

	/**
	 * Runs when the state is exited.
	 */
	@Override
	public void end() {
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

}
