package main;

import javafx.event.ActionEvent;
import states.VehicleDriveState;

public class DriveButton extends GUIButton {

	public DriveButton(String string) {
		super(string);

	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "PARKED" || super.getCurrentState() == "ON") {
			VehicleContext.instance().changeState(VehicleDriveState.instance());
		}
		// Vehicle can only access DRIVE from ON or PARKED position
	}

}
