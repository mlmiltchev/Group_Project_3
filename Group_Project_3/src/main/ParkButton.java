package main;

import javafx.event.ActionEvent;

public class ParkButton extends GUIButton {

	public ParkButton(String string) {
		super(string);
	}

	@Override
	public void handle(ActionEvent event) {
		// do Park event logic here
		UserInterface.gearText.setText("Vehicle is Parked");
	}

}
