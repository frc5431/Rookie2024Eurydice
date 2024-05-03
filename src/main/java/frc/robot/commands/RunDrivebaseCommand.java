package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivebase;

public class RunDrivebaseCommand extends Command {
    Drivebase drivebase;
    DoubleSupplier leftSpeed;
    DoubleSupplier rightSpeed;

    public RunDrivebaseCommand(Drivebase drivebase, DoubleSupplier rightSpeed, DoubleSupplier leftSpeed) {
        this.drivebase = drivebase;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
        addRequirements(drivebase);

    }
    
    @Override
    public void execute() {
        drivebase.leftSide(leftSpeed.getAsDouble());
        SmartDashboard.putNumber("left", leftSpeed.getAsDouble());
        SmartDashboard.putNumber("right", rightSpeed.getAsDouble());
        drivebase.rightSide(rightSpeed.getAsDouble());  
    }

    @Override
    public void end(boolean interrupted){
        drivebase.leftSide(0);
        drivebase.rightSide(0);
    }

}
