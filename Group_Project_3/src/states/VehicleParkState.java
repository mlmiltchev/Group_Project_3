package states;

import main.UserInterface;
import main.VehicleContext;

/**
 * VehicleParkState handles the vehicle when the state to 
 * change the gear to park is initiated.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleParkState extends VehicleState {
	private static VehicleParkState instance;
	private State state = State.PARKED;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleParkState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleParkState
	 * 			the singleton instance object
	 */
	public static VehicleParkState instance() {
		if (instance == null) {
			instance = new VehicleParkState();
		}
		return instance;
	}

	/**
	 * Switches the vehicle to park if possible.
	 */
	@Override
	public void gearPark() {
		if (VehicleContext.instance().getSpeed() == 0) {
			UserInterface.gearText.setText("Vehicle is Parked");
		} else {
			// Vehicle is still moving, even though in the BRAKE state. The act
			// of slowing down is still in progress.
		}
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		gearPark();
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
