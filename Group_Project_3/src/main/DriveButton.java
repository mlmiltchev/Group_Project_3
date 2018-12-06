package main;

import javafx.event.ActionEvent;
import states.VehicleDriveState;

/**
 * DriveButton handles the action for pressing the drive button
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class DriveButton extends GUIButton {

	/**
	 * Public constructor to create the drive button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public DriveButton(String string) {
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
		if (super.getCurrentState() == "PARKED") {
			VehicleContext.instance().changeState(VehicleDriveState.instance());
		}
		// Vehicle can only access DRIVE from the PARKED state
	}

}
