package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp (name = "baza1")
public class bazatest1 extends LinearOpMode {

     DcMotor Rfront;
     DcMotor Rback;
     DcMotor Lfront;
     DcMotor Lback;


    public void runOpMode(){

        Rfront = hardwareMap.get(DcMotor.class , "Rfrontmotor");
        Rback = hardwareMap.get(DcMotor.class , "Rbackmotor");
        Lfront = hardwareMap.get(DcMotor.class , "Lfrontmotor");
        Lback = hardwareMap.get(DcMotor.class , "Lbackmotor");

        Rfront.setDirection(DcMotorSimple.Direction.REVERSE);
        Rback.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

            while (opModeIsActive()){

                double forward = -gamepad1.left_stick_y;
                double turn = gamepad1.left_stick_x;
                double strafe = gamepad1.right_stick_x;

                Lfront.setPower(forward+turn+strafe);
                Rfront.setPower(forward-turn-strafe);
                Lback.setPower(forward-turn+strafe);
                Rback.setPower(forward+turn-strafe);

            }


    }


    

}
