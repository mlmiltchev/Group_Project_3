package main;

import javafx.event.ActionEvent;
import states.VehicleOnState;

/**
 * OnButton handles the action for pressing the button to turn the vehicle on.
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class OnButton extends GUIButton {

	/**
	 * Public constructor to create the on button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public OnButton(String string) {
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
		if (super.getCurrentState() == "OFF") {
			VehicleContext.instance().changeState(VehicleOnState.instance());
		}
		// No other states can turn the vehicle ON.
	}

}
