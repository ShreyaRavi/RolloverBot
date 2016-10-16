package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Drive extends RobotDrive {
	
	public DriveState driveState;
	
	public Drive(Victor leftMotor, Victor rightMotor) {
		super(leftMotor, rightMotor);
		driveState = DriveState.TANK_DRIVE;
	}
	
	public void update() {
		switch(driveState) {
		case TANK_DRIVE:
			IO.drive.tankDrive(IO.leftJoystick.getY(), IO.rightJoystick.getY());
			break;
		case ARCADE_DRIVE:
			IO.drive.arcadeDrive(IO.leftJoystick.getY(), IO.rightJoystick.getY());
			break;
		}
	}
	
	public void toggleDriveState() {
		if (driveState == DriveState.TANK_DRIVE) {
			driveState = DriveState.ARCADE_DRIVE;
		} else {
			driveState = DriveState.TANK_DRIVE;
		}
	}
	

}
