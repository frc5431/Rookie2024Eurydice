package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivebase extends SubsystemBase {
    WPI_TalonSRX leftBack;
    WPI_TalonSRX leftFront;
    WPI_TalonSRX rightFront;
    WPI_TalonSRX rightBack;
    
    public Drivebase (WPI_TalonSRX leftBack, WPI_TalonSRX leftFront, WPI_TalonSRX rightFront, WPI_TalonSRX rightBack) {
        this.leftBack = leftBack;
        this.leftFront = leftFront;
        this.rightBack = rightBack;
        this.rightFront = rightBack;

        leftFront.follow(leftBack);
        rightFront.follow(rightBack);
    }

    public void leftSide(double speed) {
        leftBack.set(speed);
    }

    public void rightSide(double speed) {
        rightBack.set(speed);
    }
}
