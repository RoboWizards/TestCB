/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.commands;

/**
 *
 * @author Joe
 */
public class CommandDriveJoystick extends CommandBase {
    
    public CommandDriveJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(subsystemDrivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        subsystemDrivetrain.tankDrive(oi.getLeftSpeed(), oi.getRigtSpeed());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
