package states;

import main.UserInterface;

public class VehicleAccelerateState extends VehicleState {
	private static VehicleAccelerateState instance;
	private State state = State.ACCELERATING;

	private VehicleAccelerateState() {
		instance = this;
	}

	public static VehicleAccelerateState instance() {
		if (instance == null) {
			instance = new VehicleAccelerateState();
		}
		return instance;
	}

	@Override
	public void vehicleAccelerate() {
		UserInterface.driveText.setText("Accelerator is pressed");
	}

	@Override
	public void start() {
		vehicleAccelerate();
		// STILL NEED TIMING LOGIC

	}

	@Override
	public void end() {
		// TODO
	}

	@Override
	public State getState() {
		return state;
	}

}