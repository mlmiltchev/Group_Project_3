package main;
import states.*;
import states.VehicleState;

public class VehicleContext {
	public boolean isOff = true;
	public Gear gear = new Gear();

	private VehicleState currentState;
	private VehicleDisplay display;
	private static VehicleContext instance;
	
	/**
     * Make it a singleton
     */
    private VehicleContext() {
        instance = this;
        currentState = VehicleOnState.instance();
    }
    
    /**
     * Return the instance
     * 
     * @return the object
     */
    public static VehicleContext instance() {
        if (instance == null) {
            instance = new VehicleContext();
        }
        return instance;
    }

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
		currentState.end();
        currentState = state;
        currentState.start();
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
