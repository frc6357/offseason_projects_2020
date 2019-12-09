package frc.robot.SuperClasses;

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
    private SpeedControllerGroup HDrive;

    /**
     * The H-Drive creation system that is required when there are only two motors for each side
     * for the H-Drive as well as two motors for the H-Drive
     * @author David Pieper
     */
    public BaseDriveHDrive()
    {
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
     * - Is the set speed of the H-drive, with 1 moving to the right, and -1 moving to the left b
     */
    public double getHDriveSpeed()
    {
        return HDrive.get();
    }

    public void setHMotorGroups(SpeedControllerGroup leftMotorGroup, SpeedControllerGroup rightMotorGroup, SpeedControllerGroup HDriveMotorGroup)
    {
        super.setMotorGroups(leftMotorGroup, rightMotorGroup);
        HDrive = HDriveMotorGroup;
    }
}