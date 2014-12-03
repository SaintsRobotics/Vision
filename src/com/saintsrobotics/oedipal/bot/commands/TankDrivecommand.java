/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saintsrobotics.oedipal.bot.commands;

import com.saintsrobotics.oedipal.bot.OI;

/**
 *
 * @author s-koos
 */
public class TankDrivecommand extends CommandBase {
    
    public TankDrivecommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        drive.setBoth(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drive.setBoth(oi.getAxis(OI.LEFT_Y),oi.getAxis(OI.RIGHT_Y));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        drive.setBoth(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
