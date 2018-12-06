package states;

import main.UserInterface;
import main.VehicleContext;

/**
 * VehicleOnState handles the vehicle when the vehicle gets
 * turned on.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleOnState extends VehicleState {
	private static VehicleOnState instance;
	private State state = State.ON;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleOnState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleOnState
	 * 			the singleton instance object
	 */
	public static VehicleOnState instance() {
		if (instance == null) {
			instance = new VehicleOnState();
		}
		return instance;
	}

	/**
	 * Sets the powerText to show the vehicle being on.
	 */
	@Override
	public void vehicleOn() {
		UserInterface.powerText.setText("Vehicle is On");
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		vehicleOn();
		VehicleContext.instance().changeState(VehicleParkState.instance());
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
