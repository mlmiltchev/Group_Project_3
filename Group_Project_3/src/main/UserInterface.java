
package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 * @author Thuy Hoang
 * @course ICS372
 * @Assignment Group Project #3
 * 
 */

public class UserInterface extends Application {
	static TextField powerText = new TextField();
	static TextField gearText = new TextField();
	static TextField driveText = new TextField();
	static GridPane gridPane = new GridPane();
	static TextArea textArea = new TextArea();

	Text titleText = new Text("Vehicle Operations");
	private GUIButton onButton = new OnButton("On");
	private GUIButton offButton = new OffButton("Off");
	private GUIButton parkButton = new ParkButton("Park");
	private GUIButton driveButton = new DriveButton("Drive");
	private GUIButton accelerateButton = new AccelerateButton("Accelerate");
	private GUIButton brakeButton = new BrakeButton("Brake");

	Label powerLabel = new Label("Power:\t");
	Label gearLabel = new Label("Gear:\t");
	Label driveLabel = new Label("Drive:\t");

	private int labelCol = 0;
	private int firstCol = labelCol + 1;
	private int secondCol = firstCol + 1;
	private int textCol = secondCol + 1;
	private int powerRow = 2;
	private int gearRow = 3;
	private int driveRow = 4;

	public static void main(String[] args) {
		VehicleContext.instance();
		launch(args);
	}

	/**
	 * Creates the stage and populates it with all of UI objects. Enforces an
	 * action upon the 'Create word' button press.
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(10);
		textArea.setWrapText(true);
		primaryStage.setTitle("Group Project #3: Vehicle GUI");
		titleText.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gridPane.add(titleText, 1, 0);
		gridPane.add(textArea, 0, 5, 3, 1);
		textArea.setDisable(true);
		setLabels();
		setTextFields();
		setButtons();
		Scene scene = new Scene(gridPane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/*
	 * Sets buttons to be displayed
	 */
	private void setButtons() {
		gridPane.add(onButton, firstCol, powerRow);
		gridPane.add(offButton, secondCol, powerRow);
		gridPane.add(driveButton, firstCol, gearRow);
		gridPane.add(parkButton, secondCol, gearRow);
		gridPane.add(accelerateButton, firstCol, driveRow);
		gridPane.add(brakeButton, secondCol, driveRow);
	}

	/*
	 * Sets the initialized text fields
	 */
	private void setTextFields() {
		gridPane.add(powerText, textCol, powerRow);
		powerText.setText("Vehicle is Off");
		powerText.setDisable(true);

		gridPane.add(gearText, textCol, gearRow);
		gearText.setText("Vehicle is Parked");
		gearText.setDisable(true);

		gridPane.add(driveText, textCol, driveRow);
		driveText.setText("N/A");
		driveText.setDisable(true);
	}

	/*
	 * Sets the labels for the buttons
	 */
	private void setLabels() {
		gridPane.add(powerLabel, labelCol, powerRow);
		gridPane.add(gearLabel, labelCol, gearRow);
		gridPane.add(driveLabel, labelCol, driveRow);
	}
}
