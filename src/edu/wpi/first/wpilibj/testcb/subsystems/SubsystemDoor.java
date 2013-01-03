/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.subsystems;

import edu.wpi.first.wpilibj.testcb.commands.CommandDoorStop;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.testcb.RobotMap;

/**
 *
 * @author Joe
 */
public class SubsystemDoor extends Subsystem {
    
    private Solenoid solenoidUp = new Solenoid(RobotMap.SOLENOID_UP);
    private Solenoid solenoidDown = new Solenoid(RobotMap.SOLENOID_DOWN);

    private boolean isDoorDown = false;
    
    public void initDefaultCommand() {
        setDefaultCommand(new CommandDoorStop());
    }
    
    public void lower(){
        solenoidDown.set(true);
        solenoidUp.set(false);
        isDoorDown = true;
    }
    
    public void raise(){
        solenoidDown.set(false);
        solenoidUp.set(true);
        isDoorDown = false;
    }

    public boolean isDoorDown() {
        return isDoorDown;
    }
    
    
    
}
