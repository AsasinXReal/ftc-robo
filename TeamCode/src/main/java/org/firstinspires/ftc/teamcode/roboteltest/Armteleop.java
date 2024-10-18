package org.firstinspires.ftc.teamcode.roboteltest;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class Armteleop extends LinearOpMode {

    DcMotor motorarm;
    Servo servomatura;
    CRServo servosample;

    public void runOpMode(){

        motorarm = hardwareMap.get(DcMotor.class , "Motorbrat");
        servomatura = hardwareMap.get(Servo.class , "Servomatura");
        servosample = hardwareMap.get(CRServo.class , "Servosample");


    }
}
