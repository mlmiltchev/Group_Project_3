package states;

public class VehicleAccelerateState extends VehicleState {
	private static VehicleAccelerateState instance;
	
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
