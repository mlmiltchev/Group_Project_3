package states;

public abstract class VehicleState {

	public enum State {
		OFF, ON, PARKED, DRIVE, ACCELERATING, BRAKING
	}

	public abstract void start();

	public abstract void end();

	public void vehicleOn() {

	}

	public void vehicleOff() {

	}

	public void gearDrive() {

	}

	public void gearPark() {

	}

	public void vehicleAccelerate() {

	}

	public void vehicleBrake() {

	}

	public State getState() {
		return null;
	}

}
