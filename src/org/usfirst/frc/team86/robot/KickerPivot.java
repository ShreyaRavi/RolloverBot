package org.usfirst.frc.team86.robot;

public class KickerPivot {
	
	public void update() {
		
		if (IO.pivotDownButton.isPressed() && IO.pivotDownButton.isPressed()) {
			IO.pivotMotor.set(Constants.PIVOT_MOTOR_REST_DOWN);
		} else if (IO.pivotDownButton.isPressed()) {
			if (IO.pivotLowerLimitSwitch.get()) {
				IO.pivotMotor.set(Constants.PIVOT_MOTOR_REST_DOWN);
			} else {
				IO.pivotMotor.set(Constants.PIVOT_MOTOR_SPEED_DOWN);
			}
		} else if (IO.pivotUpButton.isPressed()) {
			if (IO.pivotUpperLimitSwitch.get()) {
				IO.pivotMotor.set(Constants.PIVOT_MOTOR_REST_UP);
			} else {
				IO.pivotMotor.set(Constants.PIVOT_MOTOR_SPEED_UP);
			}
		} else {
			IO.pivotMotor.set(Constants.PIVOT_MOTOR_REST_DOWN);
		}
		
//		if (IO.lowerLimitSwitch.get()) {
//			if (IO.frameUpButton.isPressed()) {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_SPEED_UP);
//			} else {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_REST_DOWN);
//			}
//		} else if (IO.upperLimitSwitch.get()) {
//			if (IO.frameDownButton.isPressed()) {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_SPEED_DOWN);
//			} else {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_REST_UP);
//			}
//		} else {
//			if (IO.frameUpButton.isPressed() && IO.frameDownButton.isPressed()) {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_REST_DOWN);
//			} else if (IO.frameDownButton.isPressed()) {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_SPEED_DOWN);
//			} else if (IO.frameUpButton.isPressed()) {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_SPEED_UP);
//			} else {
//				IO.frameMotor.set(Constants.FRAME_MOTOR_REST_DOWN);
//			}
//		}
		
	}
	
}
