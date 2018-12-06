package main;

import javafx.event.ActionEvent;
import states.VehicleOffState;

/**
 * OffButton handles the action for pressing the off button
 * that turns off the vehicle
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class OffButton extends GUIButton {

	public OffButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "PARKED") {
			VehicleContext.instance().changeState(VehicleOffState.instance());
		}
		// no other states will turn the vehicle OFF.
	}
}
