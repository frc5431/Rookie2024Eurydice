package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.robot.subsystems.Manipulator;

public class Systems {
    public static Systems instance;
    public Manipulator manipulator;
    public WPI_TalonSRX manipulatorLeft = new WPI_TalonSRX(Constants.ManipulatorConstants.leftManipulatorID);
    public WPI_TalonSRX manipulatorRight = new WPI_TalonSRX(Constants.ManipulatorConstants.rightManipulatorID);
    public Systems () {
        manipulator = new Manipulator(manipulatorLeft, manipulatorRight);
        instance = this;
    }

    public Manipulator getManipulator () {
        return manipulator;
    }
}
