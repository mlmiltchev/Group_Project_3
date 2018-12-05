package main;

import javafx.event.ActionEvent;
import states.VehicleOnState;

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
