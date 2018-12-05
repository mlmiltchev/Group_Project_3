import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
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

public class UserInterface extends Application implements EventHandler<ActionEvent> {
	Text titleText = new Text("Vehicle Operations");
	Button onButton = new Button("On");
	Button offButton = new Button("Off");
	Button parkButton = new Button("Park");
	Button driveButton = new Button("Drive");
	Button decelerateButton = new Button("Brake");
	Button accelerateButton = new Button("Accelerate");
	Label powerLabel = new Label("Power:\t");
	Label gearLabel = new Label("Gear:\t");
	Label driveLabel = new Label("Drive:\t");
	TextField powerText = new TextField();
	TextField gearText = new TextField();
	TextField driveText = new TextField();

	GridPane gridPane = new GridPane();
	TextArea textArea = new TextArea();
	private int labelCol = 0;
	private int firstCol = labelCol + 1;
	private int secondCol = firstCol + 1;
	private int textCol = secondCol + 1;
	private int powerRow = 2;
	private int gearRow = 3;
	private int driveRow = 4;

	static VehicleContext car;

	public static void main(String[] args) {
		car = new VehicleContext();
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
		setButtonActions();

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
		gridPane.add(decelerateButton, secondCol, driveRow);
	}

	/*
	 * Sets action for each button pressed
	 */
	private void setButtonActions() {
		onButton.setOnAction(this);
		offButton.setOnAction(this);
		parkButton.setOnAction(this);
		driveButton.setOnAction(this);
		accelerateButton.setOnAction(this);
		decelerateButton.setOnAction(this);
	}

	/*
	 * Sets the initailized text fields
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

	/*
	 * Handles button actions
	 */
	@Override
	public void handle(ActionEvent event) {
		Object pressed = event.getSource();
		String t = (String) ((Labeled) pressed).getText();
		switch (t) {
		case "On":
			powerText.setText("Vehicle is On");
			car.isOff = false;
			break;
		case "Off":
			powerText.setText("Vehicle is Off");
			car.isOff = true;
			break;

		case "Park":
			gearText.setText("Vehicle is Parked");
			car.gear.isParked = true;
			break;

		case "Drive":
			gearText.setText("Vehicle is in Drive");
			car.gear.isParked = false;
			break;

		case "Accelerate":
			driveText.setText("Accelerator is pressed");
			car.gear.isAccelerating = true;
			break;

		case "Brake":
			driveText.setText("Brake is pressed");
			car.gear.isAccelerating = false;
			break;
		}
	}

}
