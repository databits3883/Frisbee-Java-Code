package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.MoveElevator;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Lifter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
    Spark lifter = new Spark(RobotMap.liftMotor);
    DigitalInput limit = new DigitalInput(9);
    public void move(float speed){
      lifter.set(speed);
    }
    public boolean getSwitch(){
      return limit.get();
    }
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new MoveElevator(0));
  }
}
