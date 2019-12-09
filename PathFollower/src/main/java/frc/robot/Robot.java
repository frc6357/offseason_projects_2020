/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.SpeedController;

import frc.robot.SuperClasses.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
    private static final String kDefaultAuto = "Default";
    private static final String kCustomAuto = "My Auto";
    private String m_autoSelected;
    private final SendableChooser<String> m_chooser = new SendableChooser<>();
    private SpeedController frontLeft, frontRight, backLeft, backRight, HDrive1, HDrive2;
    private BaseDriveHDrive4Motor DriveTrain;
    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {
        m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
        m_chooser.addOption("My Auto", kCustomAuto);
        SmartDashboard.putData("Auto choices", m_chooser);
        frontLeft = new TalonSRXSpeedController(Ports.frontLeftDriveMotor);
        frontRight = new TalonSRXSpeedController(Ports.frontRightDriveMotor);
        backLeft = new TalonSRXSpeedController(Ports.backLeftDriveMotor);
        backRight = new TalonSRXSpeedController(Ports.backRightDriveMotor);
        HDrive1 = new TalonSRXSpeedController(Ports.hDriveMotor1);
        HDrive2 = new TalonSRXSpeedController(Ports.hDriveMotor2);
        DriveTrain = new BaseDriveHDrive4Motor(frontLeft, frontRight, backLeft, backRight, HDrive1, HDrive2);
    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * <p>
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different autonomous modes using the dashboard. The sendable chooser
     * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
     * remove all of the chooser code and uncomment the getString line to get the
     * auto name from the text box below the Gyro
     *
     * <p>
     * You can add additional auto modes by adding additional comparisons to the
     * switch structure below with additional strings. If using the SendableChooser
     * make sure to add them to the chooser code above as well.
     */
    @Override
    public void autonomousInit() {
        m_autoSelected = m_chooser.getSelected();
        // m_autoSelected = SmartDashboard.getString("Auto Selector", kDefaultAuto);
        System.out.println("Auto selected: " + m_autoSelected);
    }

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() {
        switch (m_autoSelected) {
        case kCustomAuto:
            // Put custom auto code here
            break;
        case kDefaultAuto:
        default:
            // Put default auto code here
            break;
        }
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {
        double dJoystickLY, dJoystickRX, dJoystickRY, dTriggerR;
        dJoystickLY = OI.driverJoystick.getRawAxis(Ports.driverJoystickLeftStickY);
        dJoystickRX = OI.driverJoystick.getRawAxis(Ports.driverJoystickRightStickX);
        dJoystickRY = OI.driverJoystick.getRawAxis(Ports.driverJoystickRightStickY);
        dTriggerR   = OI.driverJoystick.getRawAxis(Ports.driverJoystickRightTrigger);

        if (dTriggerR >= 0.90)
        {
            DriveTrain.setHDriveSpeed(dJoystickRX);
            DriveTrain.setLeftSpeed(0.0);
            DriveTrain.setRightSpeed(0.0);
        }
        else
        {
            DriveTrain.setLeftSpeed(dJoystickLY);
            DriveTrain.setRightSpeed(dJoystickRY);
            DriveTrain.setHDriveSpeed(0.0);
        }
    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() {
    }
}
