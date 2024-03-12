package frc.robot.commands;
import static frc.robot.Constants.LauncherConstants.*;

import edu.wpi.first.wpilibj2.command.Command;
//import frc.robot.subsystems.PWMLauncher;

 import frc.robot.subsystems.CANLauncher;

public class IntakeNote extends Command {
  //PWMLauncher m_launcher;

   CANLauncher m_launcher;

  /** Creates a new PrepareLaunch. */
  public IntakeNote(CANLauncher launcher) {
    // save the launcher system internally
    m_launcher = launcher;

    // indicate that this command requires the launcher system
    addRequirements(m_launcher);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Set launch wheel to speed, keep feed wheel at 0 to let launch wheel spin up.
    m_launcher.setUpperMotor(kUpperMotorSpeed);
        m_launcher.setLowerMotor(kLowerMotorSpeed);

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // There is nothing we need this command to do on each iteration. You could remove this method
    // and the default blank method
    // of the base class will run.
    m_launcher.setUpperMotor(kUpperMotorSpeed);
    m_launcher.setLowerMotor(kLowerMotorSpeed);
  
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Do nothing when the command ends. The launch wheel needs to keep spinning in order to launch
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // Always return false so the command never ends on it's own. In this project we use a timeout
    // decorator on the command to end it.
    return false;
  }
}
