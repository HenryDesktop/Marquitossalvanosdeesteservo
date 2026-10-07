package org.firstinspires.ftc.teamcode;

import com.pedropathing.algorithm.Foresight;
import com.pedropathing.algorithm.ForesightConfig;
import com.pedropathing.follower.Follower;
import com.pedropathing.tuning.autotune.Tuner;
import com.pedropathing.tuning.autotune.Procedure;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.localizers.PinpointLocalizer;

import org.firstinspires.ftc.teamcode.pedro.procedures.ForesightTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.MecanumTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.PinpointTuner;
import org.firstinspires.ftc.teamcode.pedro.procedures.TwoWheelTuner;

public class Tuning {

    @Tuner
    public static Procedure foresightTuner() {
        return new ForesightTuner(
                hardwareMap -> new PinpointLocalizer(
                        hardwareMap,
                        PedroConstants.localizerConfig
                ),
                hardwareMap -> new Mecanum(
                        hardwareMap,
                        PedroConstants.drivetrainConfig
                )
        );
    }

    @Tuner
    public static Procedure pinpointTuner() {
        return new PinpointTuner();
    }
    @Tuner
    public static Procedure twoWheelTuner() {
        return new TwoWheelTuner();
    }
    @Tuner
    public static Procedure mecanumTuner() {
        return new MecanumTuner();
    }
}