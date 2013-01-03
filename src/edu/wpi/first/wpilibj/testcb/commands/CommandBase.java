package edu.wpi.first.wpilibj.testcb.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.testcb.OI;
import edu.wpi.first.wpilibj.testcb.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj.testcb.subsystems.SubsystemAir;
import edu.wpi.first.wpilibj.testcb.subsystems.SubsystemDoor;
import edu.wpi.first.wpilibj.testcb.subsystems.SubsystemDrivetrain;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static SubsystemAir subsystemAir = new SubsystemAir();
    public static SubsystemDoor subsystemDoor = new SubsystemDoor();
    public static SubsystemDrivetrain subsystemDrivetrain = new SubsystemDrivetrain();

    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        SmartDashboard.putData(subsystemAir);
        SmartDashboard.putData(subsystemDoor);
        SmartDashboard.putData(subsystemDrivetrain);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
