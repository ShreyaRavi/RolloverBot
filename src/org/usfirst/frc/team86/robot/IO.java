package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class IO {
	
	public static Joystick leftJoystick;
	public static Joystick rightJoystick;
	public static Joystick coDriveJoystick;
	
	public static Victor leftDriveMotor;
	public static Victor rightDriveMotor;
	public static Victor pivotMotor;
	public static Victor frameArmMotor;
	public static Victor kickerMotor;
	
	public static Drive drive;
		
	public static ToggleDriveStateButton toggleDriveStateButton;
	
	public static InvertibleDigitalInput pivotLowerLimitSwitch;
	public static InvertibleDigitalInput pivotUpperLimitSwitch;
	
	public static Button pivotUpButton;
	public static Button pivotDownButton;
	public static Button frameArmUpButton;
	public static Button frameArmDownButton;
	public static Button kickerOutButton;
	public static Button kickerBackButton;
	
	public static Button[] buttons = new Button[2];
	
	public static KickerPivot kickerPivot;
	
	public static FrameArm frameArm;
	
	public static Kicker kicker;
	
	public static void init() {
	
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		coDriveJoystick = new Joystick(2);
	
		leftDriveMotor = new Victor(0);
		rightDriveMotor = new Victor(1);
		pivotMotor = new Victor(4);
		frameArmMotor = new Victor(2);
		kickerMotor = new Victor(3);
		
		leftDriveMotor.setInverted(false);
		rightDriveMotor.setInverted(false);
		pivotMotor.setInverted(false);
		frameArmMotor.setInverted(false);
		kickerMotor.setInverted(false);
		
		drive = new Drive(leftDriveMotor, rightDriveMotor);
				
		toggleDriveStateButton = new ToggleDriveStateButton(leftJoystick,3);
		
		pivotLowerLimitSwitch = new InvertibleDigitalInput(0,false);
		pivotUpperLimitSwitch = new InvertibleDigitalInput(1,false);
		
//		pivotUpButton = new Button(leftJoystick, 8);
//		pivotDownButton = new Button(leftJoystick, 9);
//		frameArmUpButton = new Button(rightJoystick, 8);
//		frameArmDownButton = new Button(rightJoystick, 9);
		kickerOutButton = new Button(coDriveJoystick,8);
//		kickerBackButton = new Button(coDriveJoystick,9);
		buttons[0] = toggleDriveStateButton;
//		buttons[1] = pivotUpButton;
//		buttons[2] = pivotDownButton;
//		buttons[3] = frameArmUpButton;
//		buttons[4] = frameArmDownButton;
		buttons[1] = kickerOutButton;
//		buttons[4] = kickerBackButton;
		
//		kickerPivot = new KickerPivot();
		kicker = new Kicker();
		
		frameArm = new FrameArm();
		
	}
	
	public static void update() {
		for (Button button: buttons) {
			button.update();
		}
//		kickerPivot.update();
		frameArm.update();
		kicker.update();
		drive.update();
		
	}

}
