package main;

import javafx.event.ActionEvent;
import states.VehicleAccelerateState;

public class AccelerateButton extends GUIButton {

	public AccelerateButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "BRAKING" || super.getCurrentState() == "DRIVE") {
			VehicleContext.instance().changeState(VehicleAccelerateState.instance());
		}
		// Vehicle can only ACCELERATE when in DRIVE or when BRAKING
	}

}
