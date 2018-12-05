package main;

import javafx.event.ActionEvent;

public class OnButton extends GUIButton {

	public OnButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		// do On Event logic here
		UserInterface.powerText.setText("Vehicle is On");
	}

}
