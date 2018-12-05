package states;

import main.UserInterface;

public class VehicleBrakeState extends VehicleState {
	private static VehicleBrakeState instance;
	private State state = State.BRAKING;

	private VehicleBrakeState() {
		instance = this;
	}

	public static VehicleBrakeState instance() {
		if (instance == null) {
			instance = new VehicleBrakeState();
		}
		return instance;
	}

	@Override
	public void vehicleBrake() {
		UserInterface.driveText.setText("Brake is pressed");
	}

	@Override
	public void start() {
		vehicleBrake();
		// STILL NEED SLOWING DOWN LOGIC

	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
	}

	@Override
	public State getState() {
		return state;
	}

}
