package main;

import javafx.event.ActionEvent;

public class AccelerateButton extends GUIButton {

	public AccelerateButton(String string) {
		super(string);

	}

	@Override
	public void handle(ActionEvent event) {
		// Do accelerator event logic here
		UserInterface.driveText.setText("Accelerator is pressed");
	}

}
