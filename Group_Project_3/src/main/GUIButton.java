package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * GUIButton handles the action for pressing a button,
 * acts as a base for all created buttons.
 * 
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang
 * 
 */

public class GUIButton extends Button implements EventHandler<ActionEvent> {

	/**
	 * Public constructor to create the button with the 
	 * passed text.
	 * 
	 * @param string
	 * 			the text to create the button with
	 */
	public GUIButton(String string) {
		super(string);
		setOnAction(this);
	}

	/**
	 * Handles the ActionEvent on the button.
	 * 
	 * @param event
	 * 			the event action on the button
	 */
	@Override
	public void handle(ActionEvent event) {
	}

	/**
	 * Gets the current state
	 * 
	 * @return the string name of the current state
	 */
	public String getCurrentState() {
		return VehicleContext.instance().currentState.getState().toString();
	}

	/**
	 * Gets the current speed
	 * 
	 * @return the speed in mph as an int
	 */
	public int getCurrentSpeed() {
		return VehicleContext.instance().getSpeed();
	}
}
