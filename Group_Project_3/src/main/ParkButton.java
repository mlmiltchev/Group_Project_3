package main;

import javafx.event.ActionEvent;
import states.VehicleParkState;

public class ParkButton extends GUIButton {

	public ParkButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "BRAKING") {
			VehicleContext.instance().changeState(VehicleParkState.instance());
		}
		// Vehicle can only be PARKED when brake is applied.
	}

}
