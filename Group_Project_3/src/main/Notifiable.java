package main;

/**
 * Notifiable is an interface that allows the
 * classes that implement this interface to be notified
 * when the timer is ticked.
 *   
 * ICS372-01 - Group Project #3
 * 
 * @author Andrew Siegfried
 * 
 */

public interface Notifiable {
    
	/**
	 * Updates the time when the timer ticks.
	 */
    public void timerTicked(int time);
}
