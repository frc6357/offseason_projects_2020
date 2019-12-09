package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;;

public class TalonSRXSpeedController implements SpeedController
{
    WPI_TalonSRX speedController;

    public TalonSRXSpeedController(int CANAddress)
    {
        speedController = new WPI_TalonSRX(CANAddress);
    }

    @Override
    public void pidWrite(double output) 
    {

    }

    @Override
    public void set(double speed) 
    {

    }

    @Override
    public double get() 
    {
        return 0;
    }

    @Override
    public void setInverted(boolean isInverted) 
    {

    }

    @Override
    public boolean getInverted() 
    {
        return false;
    }

    @Override
    public void disable() 
    {

    }

    @Override
    public void stopMotor() 
    {

    }

}
