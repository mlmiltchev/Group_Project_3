package states;

import main.UserInterface;
import main.VehicleContext;
import time.Timer;
import javafx.application.Platform;
import main.Notifiable;

public class VehicleAccelerateState extends VehicleState implements Notifiable {
	private static VehicleAccelerateState instance;
	private State state = State.ACCELERATING;
	private Timer timer;

	private VehicleAccelerateState() {
		instance = this;
	}

	public static VehicleAccelerateState instance() {
		if (instance == null) {
			instance = new VehicleAccelerateState();
		}
		return instance;
	}

	@Override
	public void vehicleAccelerate() {
		UserInterface.driveText.setText("Accelerator is pressed");
	}

	@Override
	public void start() {
		vehicleAccelerate();
		timer = new Timer(this,true);
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
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				VehicleContext.instance().setSpeed(VehicleContext.instance().getSpeed()+5);	
			}
		});
	}
}