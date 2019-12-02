package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class BaseDriveHDrive extends BaseDrive
{
    SpeedController leftFront, leftMiddle, leftBack, rightFront, rightMiddle, rightBack, HDrive1, HDrive2;
    SpeedControllerGroup HDrive;

    public BaseDriveHDrive(SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack, SpeedController HDrive1, SpeedController HDrive2)
    {
        super(leftFront, leftBack, rightFront, rightBack);
        this.HDrive1 = HDrive1;
        this.HDrive2 = HDrive2;
        HDrive = new SpeedControllerGroup(this.HDrive1, this.HDrive2);
    }

    public BaseDriveHDrive (SpeedController leftFront, SpeedController leftMiddle, SpeedController leftBack, SpeedController rightFront, SpeedController rightMiddle, SpeedController rightBack, SpeedController HDrive1, SpeedController HDrive2)
    {
        super(leftFront, leftMiddle, leftBack, rightFront, rightMiddle, rightBack);
        this.HDrive1 = HDrive1;
        this.HDrive2 = HDrive2;
        HDrive = new SpeedControllerGroup(this.HDrive1, this.HDrive2);
    }

    public void setHDriveSpeed (double input)
    {
        HDrive.set(input);
    }
}