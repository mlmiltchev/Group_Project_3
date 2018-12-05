package states;

public class VehicleOnState extends VehicleState {
	private static VehicleOnState instance;
	
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
