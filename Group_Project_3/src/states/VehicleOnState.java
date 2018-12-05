package states;

import main.UserInterface;

public class VehicleOnState extends VehicleState {
	private static VehicleOnState instance;
	private State state = State.ON;

	private VehicleOnState() {
		instance = this;
	}

	public static VehicleOnState instance() {
		if (instance == null) {
			instance = new VehicleOnState();
		}
		return instance;
	}

	@Override
	public void vehicleOn() {
		UserInterface.powerText.setText("Vehicle is On");
	}

	@Override
	public void start() {
		vehicleOn();
	}

	@Override
	public void end() {
	}

	@Override
	public State getState() {
		return state;
	}

}
