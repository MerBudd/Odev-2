// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Intake;

public class IntakeCmd extends Command {
  IntakeCmd m_intake;
  double m_speed_intake;

  Feeder m_feeder;
  double m_speed_feeder;

  public IntakeCmd(IntakeCmd intake, double speed_intake, Feeder feeder, double speed_feeder) {
    this.m_intake = intake;
    this.m_speed_intake = speed_intake;
    this.m_feeder = feeder;
    this.m_speed_feeder = speed_feeder;
    addRequirements(m_intake, m_feeder);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_intake.setIntake(m_speed_intake);
    m_feeder.setFeeder(m_speed_feeder);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
