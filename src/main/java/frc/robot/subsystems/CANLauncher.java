// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.LauncherConstants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CANLauncher extends SubsystemBase {
  CANSparkMax m_upperMotor;
  CANSparkMax m_lowerMotor;

  /** Creates a new Launcher. */
  public CANLauncher() {
    m_upperMotor = new CANSparkMax(upperMotor, MotorType.kBrushed);
    m_lowerMotor = new CANSparkMax(lowerMotor, MotorType.kBrushed);

    m_upperMotor.setSmartCurrentLimit(kUpperMotorCurrentLimit);
    m_lowerMotor.setSmartCurrentLimit(kLowerMotorCurrentLimit);
  }

  /**
   * This method is an example of the 'subsystem factory' style of command creation. A method inside
   * the subsytem is created to return an instance of a command. This works for commands that
   * operate on only that subsystem, a similar approach can be done in RobotContainer for commands
   * that need to span subsystems. The Subsystem class has helper methods, such as the startEnd
   * method used here, to create these commands.
   */

   //TODO Check what this command is supposed to do
  // public Command getIntakeCommand() {
  //   // The startEnd helper method takes a method to call when the command is initialized and one to
  //   // call when it ends
  //   return this.startEnd(
  //       // When the command is initialized, set the wheels to the intake speed values
  //       () -> {
  //         setUpperMotor(kUpperMotorSpeed);
  //         setLaunchWheel(kLowerMotorSpeed);
  //       },
  //       // When the command stops, stop the wheels
  //       () -> {
  //         stop();
  //       });
  // }

  // private void setUpperMotor(double kintakefeederspeed) {
  //   // TODO Auto-generated method stub
  //   throw new UnsupportedOperationException("Unimplemented method 'setUpperMotor'");
  // }

  // An accessor method to set the speed (technically the output percentage) of the launch wheel
  public void setUpperMotor(double speed) {
    m_upperMotor.set(speed);
  }

  // An accessor method to set the speed (technically the output percentage) of the feed wheel
  public void setLowerMotor(double speed) {
    m_lowerMotor.set(speed);
  }

  // A helper method to stop both wheels. You could skip having a method like this and call the
  // individual accessors with speed = 0 instead
  public void stop() {
    m_upperMotor.set(0);
    m_lowerMotor.set(0);
  }
}
