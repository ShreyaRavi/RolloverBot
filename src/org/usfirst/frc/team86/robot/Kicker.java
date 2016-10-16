package org.usfirst.frc.team86.robot;

public class Kicker {
	
	public void update() {
		if (IO.kickerOutButton.isPressed()) {
			IO.kickerMotor.set(Constants.KICKER_SPEED_OUT);
		} else {
			IO.kickerMotor.set(Constants.KICKER_SPEED_REST);
		}
	}
}
