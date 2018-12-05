package main;

import javafx.event.ActionEvent;
import states.VehicleDriveState;

public class DriveButton extends GUIButton {

	public DriveButton(String string) {
		super(string);

	}

	@Override
	public void handle(ActionEvent event) {
		if (super.getCurrentState() == "PARKED") {
			VehicleContext.instance().changeState(VehicleDriveState.instance());
		}
		// Vehicle can only access DRIVE from the PARKED state
	}

}
