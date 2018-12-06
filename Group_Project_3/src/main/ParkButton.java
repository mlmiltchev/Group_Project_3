package main;

import javafx.event.ActionEvent;
import states.VehicleParkState;

/**
 * ParkButton handles the action for pressing the park button which
 * puts the vehicle in park.
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class ParkButton extends GUIButton {

	public ParkButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "BRAKING" || super.getCurrentSpeed() == 0) {
			VehicleContext.instance().changeState(VehicleParkState.instance());
		}
		// Vehicle can only be PARKED when brake is applied and speed is 0
	}

}
