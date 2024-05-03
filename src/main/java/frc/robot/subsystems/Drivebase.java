package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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
        this.rightFront = rightFront;

        leftFront.follow(leftBack);
        leftFront.setInverted(true);
        leftBack.setInverted(true);
        rightFront.follow(rightBack);
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("right front", rightFront.getMotorOutputPercent());
        SmartDashboard.putNumber("right back", rightBack.getMotorOutputPercent());
        SmartDashboard.putNumber("left front", leftFront.getMotorOutputPercent());
        SmartDashboard.putNumber("left back", leftBack.getMotorOutputPercent());
    }

    public void leftSide(double speed) {
        leftBack.set(speed);
    }

    public void rightSide(double speed) {
        rightBack.set(speed);
    }
}
