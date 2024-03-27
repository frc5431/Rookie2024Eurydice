package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.subsystems.Drivebase;
import frc.robot.subsystems.Manipulator;

public class Systems {
    public static Systems instance;
    public Manipulator manipulator;
    public Drivebase drivebase;

    public WPI_TalonSRX manipulatorLeft = new WPI_TalonSRX(Constants.ManipulatorConstants.leftManipulatorID);
    public WPI_TalonSRX manipulatorRight = new WPI_TalonSRX(Constants.ManipulatorConstants.rightManipulatorID);

    public WPI_TalonSRX drivebaseLeftFront = new WPI_TalonSRX(Constants.DrivebaseConstants.leftFrontID);
    public WPI_TalonSRX drivebaseLeftBack = new WPI_TalonSRX(Constants.DrivebaseConstants.leftBackID);
    public WPI_TalonSRX drivebaserightFront = new WPI_TalonSRX(Constants.DrivebaseConstants.rightfrontID);
    public WPI_TalonSRX drivebaserightBack = new WPI_TalonSRX(Constants.DrivebaseConstants.rightBackID);
    
    public Systems () {
        manipulator = new Manipulator(manipulatorLeft, manipulatorRight);
        drivebase = new Drivebase(drivebaseLeftBack, drivebaseLeftFront, drivebaserightFront, drivebaserightBack);
        instance = this;
    }

    public Manipulator getManipulator () {
        return manipulator;
    }

    public Drivebase getDrivebase () {
        return drivebase;
    }
}
