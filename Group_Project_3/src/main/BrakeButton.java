package main;

import javafx.event.ActionEvent;
import states.VehicleBrakeState;

public class BrakeButton extends GUIButton {

	public BrakeButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "DRIVE" || super.getCurrentState() == "ACCELERATING") {
			VehicleContext.instance().changeState(VehicleBrakeState.instance());
		}
		// Vehicle can only break when in DRIVE or when ACCELERATING
	}

}
