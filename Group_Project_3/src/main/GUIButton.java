package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class GUIButton extends Button implements EventHandler<ActionEvent> {

	public GUIButton(String string) {
		super(string);
		setOnAction(this);
	}

	@Override
	public void handle(ActionEvent event) {
	}

	public String getCurrentState() {
		return VehicleContext.instance().currentState.getState().toString();
	}

	public int getCurrentSpeed() {
		return VehicleContext.instance().getSpeed();
	}
}
