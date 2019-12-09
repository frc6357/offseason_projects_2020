package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class BaseDrive4Motor extends BaseDrive
{
    private SpeedController leftFront, rightFront, leftBack, rightBack;
    private SpeedControllerGroup leftMotors, rightMotors;
    
    public BaseDrive4Motor (SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack)
    {
        this.leftFront = leftFront;
        this.leftBack = leftBack;
        this.rightFront = rightFront;
        this.rightBack = rightBack;
        this.leftMotors = new SpeedControllerGroup(this.leftFront, this.leftBack);
        this.rightMotors = new SpeedControllerGroup(this.rightFront, this.rightBack);
        super.setMotorGroups(leftMotors, rightMotors);
    }
}