package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="encoder1")
public class tema2 extends LinearOpMode {

    DcMotor motor1;
    DcMotor motor2;
    DcMotor motor3;
    DcMotor motor4;
    int tickTarget = 5000;

    @Override
    public void waitForStart(){
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class , "motor2");
        motor3 = hardwareMap.get(DcMotor.class , "motor3");
        motor4 = hardwareMap.get(DcMotor.class , "motor4");

        motor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor1.setTargetPosition(tickTarget);
        motor1.setPower(1);
        motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor2.setTargetPosition(tickTarget);
        motor2.setPower(1);
        motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motor3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor3.setTargetPosition(tickTarget);
        motor3.setPower(1);
        motor3.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motor4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor4.setTargetPosition(tickTarget);
        motor4.setPower(1);
        motor4.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }


}
