package states;

public class gearDriveState extends VehicleState {
	private static gearDriveState instance;
	
	private gearDriveState() {
		instance = this;
	}
	
	public static gearDriveState instance() {
        if (instance == null) {
            instance = new gearDriveState();
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
