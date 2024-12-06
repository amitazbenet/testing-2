// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package com.ma5951.utils.DashBoard;

import com.pathplanner.lib.auto.AutoBuilder;

import edu.wpi.first.wpilibj2.command.Command;

/** Add your docs here. */
public class AutoOption {

    private Command autoCommand;
    private String name;
    private boolean isPathPlanner = false;
    private String pathPlannerName;

    //Use this to create auto option that was created with path planner
    public AutoOption(String optionName , String PathPlannerAutoName) {
        autoCommand = AutoBuilder.buildAuto(PathPlannerAutoName);
        name = optionName;
        pathPlannerName = PathPlannerAutoName;
        isPathPlanner = true;
    }

    //Use this to create auto option that was created with regular command path planner
    public AutoOption(Command command, String optionName) {
        autoCommand = command;
        name = optionName;
    }

    public String getName() {
        return name;
    }

    public boolean isPathPlannerAuto() {
        return isPathPlanner;
    }

    public String getPathPlannerAutoName() {
        return pathPlannerName;
    }

    public Command getCommand() {
        return autoCommand;
    }
}
