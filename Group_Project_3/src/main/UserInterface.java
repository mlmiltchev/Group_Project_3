
package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * UserInterface is the main creator and handler of the interface
 * that the user handles. It displays the current state of the vehicle.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Thuy Hoang, Mihail Miltchev
 * 
 */

public class UserInterface extends Application {
	public static TextField powerText = new TextField();
	public static TextField gearText = new TextField();
	public static TextField driveText = new TextField();
	public static GridPane gridPane = new GridPane();

	public static Label speedLabel = new Label("\tSpeed: 0 MPH");

	private GUIButton onButton = new OnButton("On");
	private GUIButton offButton = new OffButton("Off");
	private GUIButton parkButton = new ParkButton("Park");
	private GUIButton driveButton = new DriveButton("Drive");
	private GUIButton accelerateButton = new AccelerateButton("Accelerate");
	private GUIButton brakeButton = new BrakeButton("Brake");

	private final Text titleText = new Text("Vehicle Operations");
	private final Label powerLabel = new Label("Power:\t");
	private final Label gearLabel = new Label("Gear:\t");
	private final Label driveLabel = new Label("Drive:\t");

	private final int labelCol = 0;
	private final int firstCol = labelCol + 1;
	private final int secondCol = firstCol + 1;
	private final int textCol = secondCol + 1;
	private final int powerRow = 2;
	private final int gearRow = 3;
	private final int driveRow = 4;

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

		primaryStage.setTitle("Group Project #3: Vehicle GUI");
		titleText.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gridPane.add(titleText, 1, 0);

		setLabels();
		setTextFields();
		setButtons();
		Scene scene = new Scene(gridPane, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() { //End program - credits to Brahma Dathan Microwave
            @Override
            public void handle(WindowEvent window) {
                System.exit(0);
            }
        });
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
		gridPane.add(speedLabel, textCol, driveRow + 1);
	}

	/*
	 * Updates the speed on the UI
	 */
	public static void updateSpeed(int mph) {
		speedLabel.setText((String.format("\tSpeed: %d MPH", mph)));
	}

}
