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

	/**
	 * Public constructor to create the off button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public OffButton(String string) {
		super(string);
	}

	/**
	 * Handles the ActionEvent on the button.
	 * 
	 * @param event
	 * 			the click event action on the button
	 */
	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "PARKED") {
			VehicleContext.instance().changeState(VehicleOffState.instance());
		}
		// no other states will turn the vehicle OFF.
	}
}
