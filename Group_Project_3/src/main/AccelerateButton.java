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
	 * Initializes AccelerateButton.
	 * 
	 * @param string
	 * 			the text on the button
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
