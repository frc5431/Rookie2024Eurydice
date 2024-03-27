package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivebase;

public class RunDrivebaseCommand extends Command {
    Drivebase drivebase;
    double leftSpeed;
    double rightSpeed;

    public RunDrivebaseCommand(Drivebase drivebase, double rightSpeed, double leftSpeed) {
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;

    }
    
    @Override
    public void initialize() {
        drivebase.leftSide(leftSpeed);
        
        drivebase.rightSide(rightSpeed);  
    }

    @Override
    public void end(boolean interrupted){
        drivebase.leftSide(0);
        drivebase.rightSide(0);
    }

}
