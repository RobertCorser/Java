// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static frc.robot.Constants.LauncherConstants.kLowerMotorSpeed;
import static frc.robot.Constants.LauncherConstants.kUpperMotorSpeed;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANLauncher;

public class Intake extends Command {
  CANLauncher m_launcher;
  /** Creates a new Intake. 
   */
  public Intake(CANLauncher m_launcher) {
  
    
    // indicate that this command requires the launcher system
    addRequirements(m_launcher);
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_launcher.setUpperMotor(kUpperMotorSpeed);
    m_launcher.setLowerMotor(kLowerMotorSpeed);
  }



  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
