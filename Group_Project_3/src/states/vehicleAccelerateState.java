package states;

public class vehicleAccelerateState extends VehicleState {
	private static vehicleAccelerateState instance;
	
	private vehicleAccelerateState() {
		instance = this;
	}
	
	public static vehicleAccelerateState instance() {
        if (instance == null) {
            instance = new vehicleAccelerateState();
        }
        return instance;
    }
	
	@Override
	public void vehicleAccelerate() {
		
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
