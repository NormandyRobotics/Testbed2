// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MotorControl extends SubsystemBase {
  Jaguar leftMotor;
  Jaguar rightMotor;

  Servo servo;

  Relay spikeMotor;

  AnalogInput rangeFinder;

  DigitalInput limitSwitch;



  /** Creates a new MotorControl. */
  public MotorControl() {
    leftMotor = new Jaguar(Constants.LEFT_MOTOR);
    leftMotor.setInverted(false);
    rightMotor = new Jaguar(Constants.RIGHT_MOTOR);
    rightMotor.setInverted(false);

    servo = new Servo(Constants.SERVO);

    spikeMotor = new Relay(Constants.SPIKE_MOTOR);

    rangeFinder = new AnalogInput(Constants.RANGE_FINDER);

    limitSwitch = new DigitalInput(Constants.LIMIT_SWITCH);

  }

  public void driveForward(double speedLeft, double speedRight)
  {
    leftMotor.set(speedLeft);
    rightMotor.set(speedRight);
  }

  public void driveWithJoysticks(XboxController driverJoystick, double leftSpeed, double rightSpeed)
  {

    leftMotor.set(driverJoystick.getRawAxis(Constants.DRIVER_JOYSTICK_Y1)*leftSpeed);
    rightMotor.set(driverJoystick.getRawAxis(Constants.DRIVER_JOYSTICK_Y2)*rightSpeed);

  }
  
  public void stop()
  {
    leftMotor.stopMotor();
    rightMotor.stopMotor();
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
