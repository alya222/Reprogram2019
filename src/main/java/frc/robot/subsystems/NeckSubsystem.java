/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class NeckSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Compressor Airow = new Compressor(21);
  Solenoid NeckPusher = new Solenoid(21, 2);
  boolean neckOut = false;
  
public NeckSubsystem(){

}

public void out(){

  NeckPusher.set(true);
  neckOut = true;
}

public void in(){

  NeckPusher.set(false);
  neckOut = false;
}

public void switchState() {
  if (neckOut = false) {
    this.in();
  }
else {
  this.out();
}
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}