package states;

import javafx.application.Platform;
import main.Notifiable;
import main.UserInterface;
import main.VehicleContext;
import time.Timer;

public class VehicleBrakeState extends VehicleState implements Notifiable {
	private static VehicleBrakeState instance;
	private State state = State.BRAKING;
	private Timer timer;

	private VehicleBrakeState() {
		instance = this;
	}

	public static VehicleBrakeState instance() {
		if (instance == null) {
			instance = new VehicleBrakeState();
		}
		return instance;
	}

	@Override
	public void vehicleBrake() {
		UserInterface.driveText.setText("Brake is pressed");
	}

	@Override
	public void start() {
		vehicleBrake();
		timer = new Timer(this,false);
	}

	@Override
	public void end() {
		timer.stop();
		timer = null;
	}

	@Override
	public State getState() {
		return state;
	}

	@Override
	public void timerTicked(int time) {
		Platform.runLater(new Runnable(){
			@Override
			public void run() {
				VehicleContext.instance().setSpeed(VehicleContext.instance().getSpeed()-5);			
			}
		});
	}
}
