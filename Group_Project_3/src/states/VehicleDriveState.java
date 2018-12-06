package states;

import main.UserInterface;

/**
 * VehicleDriveState handles the vehicle when the state to 
 * change the gear to drive is initiated.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public class VehicleDriveState extends VehicleState {
	private static VehicleDriveState instance;
	private State state = State.DRIVE;

	/**
	 * Private constructor to set the singleton up.
	 */
	private VehicleDriveState() {
		instance = this;
	}

	/**
	 * Gets the singleton object.
	 * 
	 * @return VehicleDriveState
	 * 			the singleton instance object
	 */
	public static VehicleDriveState instance() {
		if (instance == null) {
			instance = new VehicleDriveState();
		}
		return instance;
	}

	/**
	 * Sets the gearText to show that the vehicle is in drive.
	 */
	@Override
	public void gearDrive() {
		UserInterface.gearText.setText("Vehicle is in Drive");
	}

	/**
	 * Runs when the state is entered.
	 */
	@Override
	public void start() {
		gearDrive();
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
