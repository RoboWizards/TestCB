/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.testcb.RobotMap;
import edu.wpi.first.wpilibj.testcb.commands.CommandCompressorEnable;

/**
 *
 * @author Joe
 */
public class SubsystemAir extends Subsystem {
    
    private Compressor compressor = new Compressor(RobotMap.PRESSURE_SWITCH, RobotMap.COMPRESSOR_RELAY);

    public void initDefaultCommand() {
        setDefaultCommand(new CommandCompressorEnable());
    }
    
    public void start(){
        if(!compressor.enabled()){
            compressor.start();
        }
    }
    
    public void stop(){
        if(compressor.enabled()){
            compressor.stop();
        }
    }
    
    public boolean isRunning(){
        return compressor.enabled();
    }
    
}
