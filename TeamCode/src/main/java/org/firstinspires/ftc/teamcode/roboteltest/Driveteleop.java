package org.firstinspires.ftc.teamcode.roboteltest;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Driveteleop extends LinearOpMode {

    DcMotor motorFrontLeft;
    DcMotor motorFrontRight;
    DcMotor motorBackLeft;
    DcMotor motorBackRight;

    public void runOpMode(){

        motorFrontLeft = hardwareMap.get(DcMotor.class , "MotorFL");
        motorFrontRight = hardwareMap.get(DcMotor.class , "MotorFR");
        motorBackLeft = hardwareMap.get(DcMotor.class , "MotorBL");
        motorBackRight = hardwareMap.get(DcMotor.class , "MotorBR");

        motorFrontRight.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBackRight.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()){
            double y = -gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x * 1.1;
            double rx = gamepad1.right_stick_x;

            double puterefull = Math.max(Math.abs(y)+Math.abs(x)+Math.abs(rx), 1);
            double putereFrontLeft = (y+x+rx)/puterefull;
            double putereFrontRight =(y-x-rx)/puterefull;
            double putereBackLeft = (y-x+rx)/puterefull;
            double putereBackRight = (y+x-rx)/puterefull;

            motorFrontLeft.setPower(putereFrontLeft);
            motorFrontRight.setPower(putereFrontRight);
            motorBackLeft.setPower(putereBackLeft);
            motorBackRight.setPower(putereBackRight);

        }

    }


}
