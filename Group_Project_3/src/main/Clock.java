package main;

public class Clock implements Runnable {
	private static Clock instance;

	public Clock() {
		new Thread(this).start();
	}

	public static Clock instance() {
		if (instance == null) {
			instance = new Clock();
		}
		return instance;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1000);
				// VehicleContext.instance().updateDisplay();
			}
		} catch (InterruptedException ie) {
		}
	}
}
