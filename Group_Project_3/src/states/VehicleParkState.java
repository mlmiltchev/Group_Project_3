package states;

public class VehicleParkState extends VehicleState {
	private static VehicleParkState instance;
	
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
