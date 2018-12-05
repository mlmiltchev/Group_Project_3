package states;

public class VehicleOffState extends VehicleState {
	private static VehicleOffState instance;
	
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
