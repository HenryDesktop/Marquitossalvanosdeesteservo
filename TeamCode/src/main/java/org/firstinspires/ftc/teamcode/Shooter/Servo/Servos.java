package org.firstinspires.ftc.teamcode.Shooter.Servo;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.servos.ServoEx;
import com.seattlesolvers.solverslib.hardware.servos.ServoExGroup;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Servos extends SubsystemBase {
    private ServoEx servoLeft;
    private ServoEx servoRight;
    private ServoExGroup servoExGroup;

    public Servos(HardwareMap hwMap){
        servoLeft = new ServoEx(hwMap, "ShooterLeft");
        servoRight = new ServoEx(hwMap, "ShooterRight");

        servoRight.setInverted(true);
        servoLeft.setInverted(false);
        servoExGroup = new ServoExGroup(servoLeft, servoRight);
    }
    public void left(){
        servoExGroup.set(0.2);
    }
    public void right(){
        servoExGroup.set(0.5);
    }
    public double servoLeftPosition(){
        return servoLeft.get();
    }
    public double servoRightPosition(){
        return servoRight.get();
    }

    @Override
    public void periodic() {
        super.periodic();
    }
}
