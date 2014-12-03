
package com.saintsrobotics.oedipal.bot.subsystems;

import com.saintsrobotics.oedipal.bot.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController leftMotor = new Talon(RobotMap.LEFT_MOTOR);
    SpeedController rightMotor = new Talon(RobotMap.RIGHT_MOTOR);
    
    public void initDefaultCommand() {
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setBoth(double left, double right) {
        leftMotor.set(left);
        rightMotor.set(right);
    }
    
    public void setBoth(double val) {
        leftMotor.set(val);
        rightMotor.set(val);
    }
    
    public void setLeft(double val) {
        leftMotor.set(val);
    }
    
    public void setRight(double right) {
        rightMotor.set(right);
    }
}

