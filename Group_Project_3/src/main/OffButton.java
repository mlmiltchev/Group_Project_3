package main;

import javafx.event.ActionEvent;
import states.VehicleOffState;

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
