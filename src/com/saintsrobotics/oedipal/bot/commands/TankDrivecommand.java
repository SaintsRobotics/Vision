package com.saintsrobotics.oedipal.bot.commands;

import com.saintsrobotics.oedipal.bot.OI;

public class TankDrivecommand extends CommandBase {
    
    public TankDrivecommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        driveSubsystem.setBoth(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveSubsystem.setBoth(oi.getAxis(OI.LEFT_Y),oi.getAxis(OI.RIGHT_Y));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        driveSubsystem.setBoth(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
