package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivebase;

public class RunDrivebaseCommand extends Command {
    Drivebase drivebase;
    double speed;
    boolean isLeft;

    public RunDrivebaseCommand(Drivebase drivebase, boolean isLeft, double speed) {
        this.speed = speed;
        this.isLeft = isLeft;

    }
    
    @Override
    public void initialize() {
        if (isLeft){
            drivebase.leftSide(speed);
        }
        else {
            drivebase.rightSide(speed);
        }
        
    }

    @Override
    public void end(boolean interrupted){
        drivebase.leftSide(0);
        drivebase.rightSide(0);
    }

}
