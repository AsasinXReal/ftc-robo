package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="encoder1")
public class tema2 extends LinearOpMode {

    DcMotor motor1;
    int tickTarget = 5000;

    @Override
    public void runOpMode(){
        motor1 = hardwareMap.get(DcMotor.class, "motor1");

        motor1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor1.setTargetPosition(tickTarget);
        motor1.setPower(1);
        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }


}
