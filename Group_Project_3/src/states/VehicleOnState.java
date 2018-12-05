package states;

import main.UserInterface;
import main.VehicleContext;

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
		VehicleContext.instance().changeState(VehicleParkState.instance());
	}

	@Override
	public void end() {
	}

	@Override
	public State getState() {
		return state;
	}

}
