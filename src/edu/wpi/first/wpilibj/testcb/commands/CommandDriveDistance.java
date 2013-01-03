/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.commands;

/**
 *
 * @author Joe
 */
public class CommandDriveDistance extends CommandBase {
    
    private final double leftSpeed;
    private final double rightSpeed;
    
    private final double wait;
    
    public CommandDriveDistance(double wait, double leftSpeed, double rightSpeed) {
        requires(subsystemDrivetrain);
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        this.wait = wait;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(wait);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        subsystemDrivetrain.tankDrive(leftSpeed, rightSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        
    }
}
