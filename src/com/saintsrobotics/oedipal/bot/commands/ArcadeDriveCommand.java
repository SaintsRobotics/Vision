package com.saintsrobotics.oedipal.bot.commands;

import com.saintsrobotics.oedipal.bot.OI;

public class ArcadeDriveCommand extends CommandBase {

    public ArcadeDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        driveSubsystem.setLeft(0);
        driveSubsystem.setRight(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        driveSubsystem.setLeft(oi.getAxis(OI.LEFT_Y) + oi.getAxis(OI.RIGHT_X));
        driveSubsystem.setRight(oi.getAxis(OI.LEFT_Y) - oi.getAxis(OI.RIGHT_X));        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        driveSubsystem.setLeft(0);
        driveSubsystem.setRight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
