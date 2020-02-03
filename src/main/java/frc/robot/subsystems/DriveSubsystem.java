/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

    WPI_TalonSRX leftFrontWheel = new WPI_TalonSRX(0);
    WPI_TalonSRX rightFrontWheel = new WPI_TalonSRX(1);
    WPI_TalonSRX leftRearWheel = new WPI_TalonSRX(2);
    WPI_TalonSRX rightRearWheel = new WPI_TalonSRX(3);

   DifferentialDrive roboDrive = new DifferentialDrive(leftFrontWheel, rightFrontWheel);

    public DriveSubsystem(){

      leftRearWheel.follow(leftFrontWheel);
      rightRearWheel.follow(rightFrontWheel);

    }

    public void TankDrive(double leftControl, double rightControl) {

      leftFrontWheel.set(leftControl);
      rightFrontWheel.set(rightControl);

    }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}