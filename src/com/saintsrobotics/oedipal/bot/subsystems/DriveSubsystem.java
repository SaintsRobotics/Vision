
package com.saintsrobotics.oedipal.bot.subsystems;

import com.saintsrobotics.oedipal.bot.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController left = new Talon(RobotMap.LEFT_MOTOR);
    SpeedController right = new Talon(RobotMap.RIGHT_MOTOR);
    
    public void initDefaultCommand() {
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void tankDrive(double left, double right) {
        this.left.set(left);
        this.right.set(right);
    }
}

