package frc.robot;

import edu.wpi.first.wpilibj.Joystick;


public class OI
{
    public static Joystick driverJoystick;
    
    public OI()
    {
        driverJoystick = new Joystick(Ports.driverJoystick);

    }
}