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

}
