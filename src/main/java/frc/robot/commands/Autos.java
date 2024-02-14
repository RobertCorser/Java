// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
//import frc.robot.subsystems.PWMDrivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDrivetrain;

public final class Autos extends SequentialCommandGroup {
  /** Example static factory for an autonomous command. */
  public Autos(CANDrivetrain drivetrain) {
    addCommands(
          new RunCommand(() -> drivetrain.arcadeDrive(.5,-90), drivetrain)
.withTimeout(1), new RunCommand(() -> drivetrain.arcadeDrive(0,90), drivetrain)
.withTimeout(1), new RunCommand(() -> drivetrain.arcadeDrive(0.5,0), drivetrain)
.withTimeout(1), new RunCommand(() -> drivetrain.arcadeDrive(0.,0), drivetrain)
.withTimeout(1), new RunCommand(() -> drivetrain.arcadeDrive(0,0), drivetrain)
.withTimeout(1)
    );
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
