/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //usb
  public static final int driverPort = 0;
  public static final int gunnerPort = 1;

  //pwm
  public static final int drivetrainLeft = 0;
  public static final int drivetrainRight = 1;
  public static final int shooterMotor = 2;
  public static final int liftMotor = 3;

  //relay
  public static final int shooter = 0;

  //buttons
  public static final int thumperButton = 2;
  public static final int launchMotorButton = 3;
  public static final int upButton = 5;
  public static final int downButton = 9;
}
