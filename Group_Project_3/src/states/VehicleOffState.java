package states;

import main.UserInterface;

public class VehicleOffState extends VehicleState {
	private static VehicleOffState instance;

	private State state = State.OFF;

	private VehicleOffState() {
		instance = this;
	}

	public static VehicleOffState instance() {
		if (instance == null) {
			instance = new VehicleOffState();
		}
		return instance;
	}

	@Override
	public void vehicleOff() {
		/*
		 * In order for a vehicle to be PARKED to enter this state. It must
		 * already be stopped. No need to check again.
		 */
		UserInterface.powerText.setText("Vehicle is Off");
	}

	@Override
	public void start() {
		vehicleOff();

	}

	@Override
	public void end() {
	}

	@Override
	public State getState() {
		return state;
	}

}
