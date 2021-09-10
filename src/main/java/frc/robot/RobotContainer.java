// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.Auto1;
import frc.robot.commands.Auto2;
import frc.robot.commands.DriveForwardTimed;
import frc.robot.commands.DriveWithJoysticks;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.MotorControl;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // MotorControl declare
  private final MotorControl motorControl;
  private final DriveWithJoysticks driveWithJoysticks;
  private final DriveForwardTimed driveForwardTimed;
  public static XboxController driverJoystick;
  public static XboxController operatorJoystick;
  
  //auto declare
  private final Auto1 auto1;
  private final Auto2 auto2;

  //sendable chooser declare
  SendableChooser<Command> chooser = new SendableChooser<>();
  
  /**
 * Initialize value on SmartDashboard for user input, but leave old value if already present.
 *
 * @param key The SmartDashboard key to associate with the value.
 * @param defValue The default value to assign if not already on dashboard.
 *
 * @return The current value that appears on the dashboard.
 */
public static double createSmartDashboardNumber(String key, double defValue) {

  // See if already on dashboard, and if so, fetch current value
  double value = SmartDashboard.getNumber(key, defValue);

  // Make sure value is on dashboard, puts back current value if already set
  // otherwise puts back default value
  SmartDashboard.putNumber(key, value);

  return value;
}





  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    motorControl = new MotorControl();
    driveWithJoysticks = new DriveWithJoysticks(motorControl);
    driveWithJoysticks.addRequirements(motorControl);
    motorControl.setDefaultCommand(driveWithJoysticks);

    driverJoystick = new XboxController(Constants.DRIVER_JOYSTICK);
    operatorJoystick = new XboxController(Constants.OPERATOR_JOYSTICK);

    driveForwardTimed = new DriveForwardTimed(motorControl);
    driveForwardTimed.addRequirements(motorControl);

    auto1 = new Auto1();
    auto2 = new Auto2();



    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
