package states;

import main.UserInterface;

public class VehicleDriveState extends VehicleState {
	private static VehicleDriveState instance;
	private State state = State.DRIVE;

	private VehicleDriveState() {
		instance = this;
	}

	public static VehicleDriveState instance() {
		if (instance == null) {
			instance = new VehicleDriveState();
		}
		return instance;
	}

	@Override
	public void gearDrive() {
		UserInterface.gearText.setText("Vehicle is in Drive");
	}

	@Override
	public void start() {
		gearDrive();
	}

	@Override
	public void end() {
	}

	@Override
	public State getState() {
		return state;
	}

}
