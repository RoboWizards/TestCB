
package edu.wpi.first.wpilibj.testcb;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.testcb.commands.CommandGroupOpenCloseDoor;
import edu.wpi.first.wpilibj.testcb.commands.CommandLowerDoor;
import edu.wpi.first.wpilibj.testcb.commands.CommandRaiseDoor;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    private final Joystick joystick1 = new Joystick(RobotMap.JOYSTICK_1);
    private final Joystick joystick2 = new Joystick(RobotMap.JOYSTICK_2);
    private final Joystick joystick3 = new Joystick(RobotMap.JOYSTICK_3);
    
    private final Button lowerButton;
    private final Button raiseButton;
    private final Button openCloseButton;
    
    public OI(){
        lowerButton = new JoystickButton(joystick3, 1);
        lowerButton.whenPressed(new CommandLowerDoor());
        
        raiseButton = new JoystickButton(joystick3, 2);
        raiseButton.whenPressed(new CommandRaiseDoor());
        
        openCloseButton = new JoystickButton(joystick3, 3);
        openCloseButton.whenPressed(new CommandGroupOpenCloseDoor());
    }
    
    public double getLeftSpeed(){
        return joystick1.getY();
    }
    
    public double getRigtSpeed(){
        return joystick2.getY();
    }
    
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

