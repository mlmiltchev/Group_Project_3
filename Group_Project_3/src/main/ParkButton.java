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

	/**
	 * Public constructor to create the park button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public ParkButton(String string) {
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
		if (super.getCurrentSpeed() == 0
				&& (super.getCurrentState() == "BRAKING" || super.getCurrentState() != "OFF")) {
			VehicleContext.instance().changeState(VehicleParkState.instance());
		}
		// Vehicle can only be PARKED when brake is applied and speed is 0
	}

}
