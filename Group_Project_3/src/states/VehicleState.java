package states;

/**
 * VehicleState is an abstract class that allows all the other
 * states for the vehicle to extend off of it.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Mihail Miltchev
 * 
 */

public abstract class VehicleState {

	public enum State {
		OFF, ON, PARKED, DRIVE, ACCELERATING, BRAKING
	}

	/**
	 * Runs when the state is entered.
	 */
	public abstract void start();

	/**
	 * Runs when the state is exited.
	 */
	public abstract void end();

	/**
	 * Turns the vehicle on.
	 */
	public void vehicleOn() {
	}

	/**
	 * Turns the vehicle off.
	 */
	public void vehicleOff() {
	}

	/**
	 * Switches gear to Drive.
	 */
	public void gearDrive() {
	}

	/**
	 * Switches gear to Park.
	 */
	public void gearPark() {
	}

	/**
	 * Applies acceleration to the vehicle.
	 */
	public void vehicleAccelerate() {
	}

	/**
	 * Applies braking to the vehicle.
	 */
	public void vehicleBrake() {
	}

	/**
	 * Gets the current state of the vehicle.
	 * 
	 * @return State
	 * 			the state that the vehicle is in.
	 */
	public State getState() {
		return null;
	}

}
