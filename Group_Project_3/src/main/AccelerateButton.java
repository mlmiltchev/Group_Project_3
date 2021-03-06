package main;

import javafx.event.ActionEvent;
import states.VehicleAccelerateState;

/**
 * AccelerateButton handles the action for pressing the accelerate button
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class AccelerateButton extends GUIButton {

	/**
	 * Public constructor to create the acceleration button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public AccelerateButton(String string) {
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
		if (super.getCurrentState() == "BRAKING" || super.getCurrentState() == "DRIVE") {
			VehicleContext.instance().changeState(VehicleAccelerateState.instance());
		}
		// Vehicle can only ACCELERATE when in DRIVE or when BRAKING
	}

}
