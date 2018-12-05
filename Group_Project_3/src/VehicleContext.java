import states.VehicleState;

public class VehicleContext {
	public boolean isOff = true;
	public Gear gear = new Gear();

	private VehicleState currentState;
	private VehicleDisplay display;

	public void setDisplay(VehicleDisplay display) {
		display = this.display;
	}
	
	public void powerOn() {
		
	}

	public void powerOff() {
		
	}

	public void gearPark() {
		
	}

	public void gearDrive() {
		
	}

	public void accelerate() {
		
	}

	public void decelerate() {

	}

	public void changeState(VehicleState state) {
		currentState = state;
	}

	public void showPower() {

	}

	public void showGear() {

	}

	public void showAccelDecel() {
		
	}
	
	public void showSpeed() {

	}
}
