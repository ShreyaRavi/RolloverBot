package org.usfirst.frc.team86.robot;

public class FrameArm {
	
	public void update() {
		
		IO.frameArmMotor.set(IO.coDriveJoystick.getY());
		
//		if (IO.frameArmUpButton.isPressed() && IO.frameArmDownButton.isPressed()) {
//			IO.frameArmMotor.set(Constants.FRAME_ARM_SPEED_REST);
//		} else if (IO.frameArmDownButton.isPressed()) {
//			IO.frameArmMotor.set(Constants.FRAME_ARM_SPEED_DOWN);
//		} else if (IO.frameArmUpButton.isPressed()) {
//			IO.frameArmMotor.set(Constants.FRAME_ARM_SPEED_UP);
//		} else {
//			IO.frameArmMotor.set(Constants.FRAME_ARM_SPEED_REST);
//		}
	}
	
}
