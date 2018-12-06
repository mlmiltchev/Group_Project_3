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

	public OnButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "OFF") {
			VehicleContext.instance().changeState(VehicleOnState.instance());
		}
		// No other states can turn the vehicle ON.
	}

}
