package states;

public class VehicleBrakeState extends VehicleState {
	private static VehicleBrakeState instance;
	
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
