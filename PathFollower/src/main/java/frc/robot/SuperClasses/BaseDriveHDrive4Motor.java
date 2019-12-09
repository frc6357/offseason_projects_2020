package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class BaseDriveHDrive4Motor extends BaseDriveHDrive
{
    private SpeedController leftFront, rightFront, leftBack, rightBack, HDrive1, HDrive2;
    private SpeedControllerGroup leftDrive, rightDrive, HDriveGroup;
    
    public BaseDriveHDrive4Motor (SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack, SpeedController HDrive1, SpeedController HDrive2)
    {
        this.leftFront = leftFront;
        this.leftBack = leftBack;
        leftDrive = new SpeedControllerGroup (this.leftFront, this.leftBack);

        this.rightFront = rightFront;
        this.rightBack = rightBack;
        rightDrive = new SpeedControllerGroup(this.rightFront, this.rightBack);

        this.HDrive1 = HDrive1;
        this.HDrive2 = HDrive2;
        HDriveGroup = new SpeedControllerGroup(this.HDrive1, this.HDrive2);

        super.setHMotorGroups(leftDrive, rightDrive, HDriveGroup);
    }
}