/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.testcb.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Joe
 */
public class CommandGroupOpenCloseDoor extends CommandGroup {
    
    public CommandGroupOpenCloseDoor() {
        addSequential(new CommandStartCompressor());
        addSequential(new CommandLowerDoor());
        addSequential(new CommandRaiseDoor());
    }
}
