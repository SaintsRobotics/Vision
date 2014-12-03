
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
    
    public void setBoth(double left, double right) {
        this.left.set(left);
        this.right.set(right);
    }
    public void setBoth(double both) {
        this.left.set(both);
        this.right.set(both);
    }
    public void setLeft(double left){
        this.left.set(left);
    }
    public void setRight(double right){
        this.right.set(right);
    }
}

