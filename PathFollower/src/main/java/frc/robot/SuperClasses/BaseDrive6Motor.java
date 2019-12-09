package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class BaseDrive6Motor extends BaseDrive
{
    private SpeedController leftFront, rightFront, leftMiddle, rightMiddle, leftBack, rightBack;
    private SpeedControllerGroup leftMotors, rightMotors;

    public BaseDrive6Motor (SpeedController leftFront, SpeedController leftMiddle, SpeedController leftBack, SpeedController rightFront, SpeedController rightMiddle, SpeedController rightBack)
    {
        this.leftFront = leftFront;
        this.leftMiddle = leftMiddle;
        this.leftBack = leftBack;
        this.rightFront = rightFront;
        this.rightMiddle = rightMiddle;
        this.rightBack = rightBack;
        this.leftMotors = new SpeedControllerGroup(this.leftFront, this.leftMiddle, this.leftBack);
        this.rightMotors = new SpeedControllerGroup(this.rightFront, this.rightMiddle, this.rightBack);

        super.setMotorGroups(leftMotors, rightMotors);
    }
}