/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.testcb.RobotMap;
import edu.wpi.first.wpilibj.testcb.commands.CommandDriveJoystick;

/**
 *
 * @author Joe
 */
public class SubsystemDrivetrain extends Subsystem {

    private RobotDrive drive = new RobotDrive(RobotMap.LEFT_FRONT_MOTOR, RobotMap.LEFT_BACK_MOTOR, RobotMap.RIGHT_FRONT_MOTOR, RobotMap.RIGHT_BACK_MOTOR);
    
    public void initDefaultCommand() {
        setDefaultCommand(new CommandDriveJoystick());
    }
    
    public void tankDrive(double leftValue, double rightValue){
        drive.tankDrive(leftValue, rightValue);
    }
    
    
    
}
