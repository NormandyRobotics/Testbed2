// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

	//PWMs
	public static final int LEFT_MOTOR = 0;
	public static final int RIGHT_MOTOR = 1;
	public static final int SERVO = 2;

	//Relay 
	public static final int SPIKE_MOTOR = 0; // 1?

	//Analog In
	public static final int RANGE_FINDER = 0;

	//Digital In
	public static final int LIMIT_SWITCH = 0;

	//Joysticks
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	public static final int DRIVER_JOYSTICK_Y1 = 1;
	public static final int DRIVER_JOYSTICK_Y2 = 3;

	//drive constants
	public static final double LEFT_SPEED = 1;
	public static final double RIGHT_SPEED = 1;

	//auto constants
	public static final double AUTONOMOUS_SPEED = 0.75;
	public static final double AUTONOMOUS_DRIVE_TIME = 3;
	
	public static final double AUTO1_LEFT = 1;
	public static final double AUTO1_RIGHT = 1;
	public static final double AUTO1_TIME = 3;

	public static final double AUTO2_LEFT = 1;
	public static final double AUTO2_RIGHT = 1;
	public static final double AUTO2_TIME = 3;







}
