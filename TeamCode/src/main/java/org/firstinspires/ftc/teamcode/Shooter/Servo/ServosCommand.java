package org.firstinspires.ftc.teamcode.Shooter.Servo;

import com.seattlesolvers.solverslib.command.CommandBase;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;

public class ServosCommand extends CommandBase {
    private final Servos servoSubsystem;
    public ServosCommand(Servos servoSubsystem){
        this.servoSubsystem = servoSubsystem;
        addRequirements(servoSubsystem);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
        servoSubsystem.right();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        servoSubsystem.left();
    }
}
