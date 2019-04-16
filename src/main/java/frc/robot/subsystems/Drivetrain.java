
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import frc.robot.RobotMap;
import frc.robot.commands.ManualDrive;

public class Drivetrain extends Subsystem {
    Spark leftMotors = new Spark(RobotMap.drivetrainLeft);
    Spark rightMotors = new Spark(RobotMap.drivetrainRight);

    DifferentialDrive drivetrain = new DifferentialDrive(leftMotors, rightMotors);

    public void drive(float x, float y){
        drivetrain.arcadeDrive(y*-1, x);
    }
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ManualDrive());
    }

}