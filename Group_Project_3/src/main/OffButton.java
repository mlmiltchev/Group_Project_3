package main;

import javafx.event.ActionEvent;

public class OffButton extends GUIButton {

	public OffButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		// do Off Event logic here
		UserInterface.powerText.setText("Vehicle is Off");
	}

}
