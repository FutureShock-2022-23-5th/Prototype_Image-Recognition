// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ApriltagSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static CommandBase Auto(ApriltagSubsystem apriltagSub, DriveSubsystem driveSub) {
    return Commands.sequence(
      new ApriltagCommand(apriltagSub, driveSub, 0)
    );
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");  }
}
