package states;

public class gearParkState extends VehicleState {
	private static gearParkState instance;
	
	private gearParkState() {
		instance = this;
	}
	
	public static gearParkState instance() {
        if (instance == null) {
            instance = new gearParkState();
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
