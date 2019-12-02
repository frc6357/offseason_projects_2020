package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public abstract class BaseDrive
{
    private SpeedController leftFront, rightFront, leftMiddle, rightMiddle, leftBack, rightBack;
    private SpeedControllerGroup leftMotors, rightMotors;

    public BaseDrive (SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack)
    {
        this.leftFront = leftFront;
        this.leftBack = leftBack;
        this.rightFront = rightFront;
        this.rightBack = rightBack;
        this.leftMotors = new SpeedControllerGroup(this.leftFront, this.leftBack);
        this.rightMotors = new SpeedControllerGroup(this.rightFront, this.rightBack);
    }

    public BaseDrive (SpeedController leftFront, SpeedController leftMiddle, SpeedController leftBack, SpeedController rightFront, SpeedController rightMiddle, SpeedController rightBack)
    {
        this.leftFront = leftFront;
        this.leftMiddle = leftMiddle;
        this.leftBack = leftBack;
        this.rightFront = rightFront;
        this.rightMiddle = rightMiddle;
        this.rightBack = rightBack;
        this.leftMotors = new SpeedControllerGroup(this.leftFront, this.leftMiddle, this.leftBack);
        this.rightMotors = new SpeedControllerGroup(this.rightFront, this.rightMiddle, this.rightBack);
    }

    public void setLeftSpeed(double input)
    {
        leftMotors.set(input);
    }

    public void setRightSpeed(double input)
    {
        rightMotors.set(input);
    }
}