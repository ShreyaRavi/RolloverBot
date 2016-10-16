
package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	Teleop teleop = new Teleop();
	
    public void robotInit() {
    	teleop.init();
    }
    
    public void autonomousInit() {
    	
    }

    public void autonomousPeriodic() {
    	
    }

    
    public void teleopPeriodic() {
        teleop.update();
    }
    
    public void testPeriodic() {
    
    }
    
}
