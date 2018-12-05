package main;

import javafx.event.ActionEvent;

public class BrakeButton extends GUIButton {

	public BrakeButton(String string) {
		super(string);

	}

	@Override
	public void handle(ActionEvent event) {
		// Do Brake Event logic here
		UserInterface.driveText.setText("Brake is pressed");
	}

}
