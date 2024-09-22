package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="encoder1")
public class tema2 extends LinearOpMode {

    DcMotor motorL1;
    DcMotor motorL2;
    DcMotor motorR3;
    DcMotor motorR4;
    int tickTarget = 5000;

    @Override
    public void runOpMode(){
        motorL1 = hardwareMap.get(DcMotor.class, "motor1");
        motorL2 = hardwareMap.get(DcMotor.class , "motor2");
        motorR3 = hardwareMap.get(DcMotor.class , "motor3");
        motorR4 = hardwareMap.get(DcMotor.class , "motor4");

        motorR3.setDirection(DcMotorSimple.Direction.REVERSE);
        motorR4.setDirection(DcMotorSimple.Direction.REVERSE);


        motorL1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorL2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    public void waitForStart(){

        motorL1.setTargetPosition(tickTarget);
        motorL1.setPower(1);
        motorL1.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorL2.setTargetPosition(tickTarget);
        motorL2.setPower(1);
        motorL2.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        motorR3.setTargetPosition(tickTarget);
        motorR3.setPower(1);
        motorR3.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorR4.setTargetPosition(tickTarget);
        motorR4.setPower(1);
        motorR4.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }


}
