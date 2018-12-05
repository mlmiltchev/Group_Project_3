package states;

public class vehicleBrakeState extends VehicleState {
	private static vehicleBrakeState instance;
	
	private vehicleBrakeState() {
		instance = this;
	}
	
	public static vehicleBrakeState instance() {
        if (instance == null) {
            instance = new vehicleBrakeState();
        }
        return instance;
    }
	
	@Override
	public void vehicleBrake() {
		
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

}
