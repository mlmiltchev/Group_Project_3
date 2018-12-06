package main;

import javafx.event.ActionEvent;
import states.VehicleBrakeState;

/**
 * BrakeButton handles the action for pressing the brake button
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class BrakeButton extends GUIButton {

	/**
	 * Public constructor to create the brake button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public BrakeButton(String string) {
		super(string);
	}

	/**
	 * Handles the ActionEvent on the button.
	 * 
	 * @param event
	 * 			the event action on the button
	 */
	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "DRIVE" || super.getCurrentState() == "ACCELERATING") {
			VehicleContext.instance().changeState(VehicleBrakeState.instance());
		}
		// Vehicle can only break when in DRIVE or when ACCELERATING
	}

}
