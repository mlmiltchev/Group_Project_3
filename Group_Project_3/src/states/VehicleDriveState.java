package states;

public class VehicleDriveState extends VehicleState {
	private static VehicleDriveState instance;
	
	private VehicleDriveState() {
		instance = this;
	}
	
	public static VehicleDriveState instance() {
        if (instance == null) {
            instance = new VehicleDriveState();
        }
        return instance;
    }
	
	@Override
	public void gearDrive() {
		
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
