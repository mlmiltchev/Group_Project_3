package main;

import javafx.event.ActionEvent;

public class DriveButton extends GUIButton {

	public DriveButton(String string) {
		super(string);

	}

	@Override
	public void handle(ActionEvent event) {
		// do Drive event logic here
		UserInterface.gearText.setText("Vehicle is in Drive");
	}

}
