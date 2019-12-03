package frc.robot.SuperClasses;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * The base class for any 2 or 3 motor sided drive train that has multiple subclasses.
 * @author David Pieper
 */
public abstract class BaseDrive
{
    private SpeedController leftFront, rightFront, leftMiddle, rightMiddle, leftBack, rightBack;
    private SpeedControllerGroup leftMotors, rightMotors;

    /**
     * The constructor for the a standard two motor per side drive train
     * @author David Pieper
     * @param leftFront <br>
     * - Type SpeedController <br>
     * - Left front motor controller
     * @param rightFront <br>
     * - Type SpeedController <br>
     * - Right front motor controlelr
     * @param leftBack <br>
     * - Type SpeedController <br>
     * - Left back motor controller
     * @param rightBack <br>
     * - Type SpeedController <br>
     * - Right back motor controller
     */
    public BaseDrive (SpeedController leftFront, SpeedController rightFront, SpeedController leftBack, SpeedController rightBack)
    {
        this.leftFront = leftFront;
        this.leftBack = leftBack;
        this.rightFront = rightFront;
        this.rightBack = rightBack;
        this.leftMotors = new SpeedControllerGroup(this.leftFront, this.leftBack);
        this.rightMotors = new SpeedControllerGroup(this.rightFront, this.rightBack);
    }

    /**
     * The standard drive train constructor for a three motor per side drivetrain
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
     * - Right rear motor controller
     */
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

    /**
     * Sets the speed for the left side of the drivetrain
     * @author David Pieper
     * @param input <br>
     * - Type double <br>
     * - The speed that the motor controller is going to be set to, 1 for full forwards and -1 for
     * full back
     */
    public void setLeftSpeed(double input)
    {
        leftMotors.set(input);
    }

    /**
     * Sets the speed for the right side of the drivetrain
     * @author David Pieper
     * @param input <br>
     * - Type double <br>
     * - The speed that the motor controller is going to be set to, 1 for full forwards and -1 for
     * full back
     */
    public void setRightSpeed(double input)
    {
        rightMotors.set(input);
    }

    /**
     * Returns the current set speed for the left side of the drivetrain
     * @author David Pieper
     * @return
     * - Type double <br>
     * - Current set speed of motor controller, 1 for full forwards, -1 for full back
     */
    public double getLeftSpeed()
    {
        return leftMotors.get();
    }

    /**
     * Returns the current set speed for the right side of the drivetrain
     * @author David Pieper
     * @return
     * - Type double <br>
     * - Current set speed of motor controller, 1 for full forwards, -1 for full back
     */
    public double getRightSpeed()
    {
        return rightMotors.get();
    }
}