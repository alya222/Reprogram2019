/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 * Add your docs here.
 */
public class DriveSubsystem extends SubsystemBase{
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX RightFrontWheel = new WPI_TalonSRX(2);
  WPI_TalonSRX LeftFrontWheel = new WPI_TalonSRX(4);
  WPI_TalonSRX RightRearWheel = new WPI_TalonSRX(1);
  WPI_TalonSRX LeftRearWheel = new WPI_TalonSRX(3);
  
  DifferentialDrive roboDrive = new DifferentialDrive(LeftFrontWheel, RightFrontWheel);

  public DriveSubsystem() {
    RightRearWheel.follow(RightFrontWheel);
    LeftRearWheel.follow(LeftFrontWheel);
  }

  public void TankDrive(double leftControl, double rightControl) {
    LeftFrontWheel.set(leftControl);
    RightFrontWheel.set(rightControl);
  }
  
  public DifferentialDrive getDifferentialDrive() {
    return roboDrive;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}