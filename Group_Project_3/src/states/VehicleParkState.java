package states;

import main.UserInterface;
import main.VehicleContext;

public class VehicleParkState extends VehicleState {
	private static VehicleParkState instance;
	private State state = State.PARKED;

	private VehicleParkState() {
		instance = this;
	}

	public static VehicleParkState instance() {
		if (instance == null) {
			instance = new VehicleParkState();
		}
		return instance;
	}

	@Override
	public void gearPark() {
		if (VehicleContext.instance().getSpeed() == 0) {
			UserInterface.gearText.setText("Vehicle is Parked");
		} else {
			// Vehicle is still moving, even though in the BRAKE state. The act
			// of slowing down is still in progress).
		}
	}

	@Override
	public void start() {
		gearPark();
	}

	@Override
	public void end() {
	}

	@Override
	public State getState() {
		return state;
	}

}
