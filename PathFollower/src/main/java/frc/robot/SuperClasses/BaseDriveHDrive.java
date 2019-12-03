package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * This code is meant to run an H-Drive in preperation for the 2020 offseason project as well as getting
 * ready for if it's to be used in the future perhaps in the 2020 season. With this it needs some work
 * as the main goal of this project is that we create a base class or set of base classes that can be
 * used for multiple years. This can run an H-Drive, and has the pieces to be able to implement an
 * H-Drive very easily in a PID controller.
 * @author David Pieper
 */
public abstract class BaseDriveHDrive extends BaseDrive
{
    SpeedController leftFront, leftMiddle, leftBack, rightFront, rightMiddle, rightBack, HDrive1, HDrive2;
    SpeedControllerGroup HDrive;

    /**
     * The H-Drive creation system that is required when there are only two motors for each side
     * for the H-Drive as well as two motors for the H-Drive
     * @author David Pieper
     * @param leftFront <br>
     * - Type SpeedController<br>
     * - Front left motor controller
     * @param rightFront <br>
     * - Type SpeedController<br>
     * - Front right motor controller
     * @param leftBack <br>
     * - Type SpeedController<br>
     * - Back left motor controller
     * @param rightBack <br>
     * - Type SpeedController<br>
     * - Back right motor controller
     * @param HDrive1 <br>
     * - Type SpeedController<br>
     * - HDrive Motor Controller 1
     * @param HDrive2 <br>
     * - Type SpeedController<br>
     * - HDrive Motor Controller 2
     */
    public BaseDriveHDrive(SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack, SpeedController HDrive1, SpeedController HDrive2)
    {
        super(leftFront, leftBack, rightFront, rightBack);
        this.HDrive1 = HDrive1;
        this.HDrive2 = HDrive2;
        HDrive = new SpeedControllerGroup(this.HDrive1, this.HDrive2);
    }

    /**
     * This constructor creates a system for an H-Drive utilizing two motors for the H-drive as
     * well as 3 drive train motors per side.
     * @author David Pieper
     * @param leftFront <br>
     * - Type SpeedController <br>
     * - Left front motor controller
     * @param leftMiddle <br>
     * - Type SpeedController <br>
     * - Left middle motor controller
     * @param leftBack <br>
     * - Type SpeedController <br>
     * - Left back motor controller
     * @param rightFront <br>
     * - Type SpeedController <br>
     * - Right front motor controller
     * @param rightMiddle <br>
     * - Type SpeedController <br>
     * - Right middle motor controller
     * @param rightBack <br>
     * - Type SpeedController <br>
     * - Right back motor controller
     * @param HDrive1 <br>
     * - Type SpeedController <br>
     * - Motor controller for the first H-Drive motor
     * @param HDrive2 <br>
     * - Type SpeedController <br>
     * - Motor controller for the second H-Drive motor
     */
    public BaseDriveHDrive (SpeedController leftFront, SpeedController leftMiddle, SpeedController leftBack, SpeedController rightFront, SpeedController rightMiddle, SpeedController rightBack, SpeedController HDrive1, SpeedController HDrive2)
    {
        super(leftFront, leftMiddle, leftBack, rightFront, rightMiddle, rightBack);
        this.HDrive1 = HDrive1;
        this.HDrive2 = HDrive2;
        HDrive = new SpeedControllerGroup(this.HDrive1, this.HDrive2);
    }

    /**
     * Sets the speed of the H-Drive with 1 being to the right and -1 being to the left
     * @author David Pieper
     * @param input <br>
     * - Type double <br>
     * - Is the speed of the H-Drive, with 1 accelerating to the right, and -1 accelerating to
     * the left
     */
    public void setHDriveSpeed (double input)
    {
        HDrive.set(input);
    }

    /**
     * Returns the speed of the H-Drive
     * @author David Pieper
     * @return
     * - Type double <br>
     * - Is the set speed of the H-drive, with 1 moving to the right, and -1 moving to the left
     */
    public double getHDriveSpeed()
    {
        return HDrive.get();
    }
}