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
        motorL1 = hardwareMap.get(DcMotor.class, "motorL1");
        motorL2 = hardwareMap.get(DcMotor.class , "motorL2");
        motorR3 = hardwareMap.get(DcMotor.class , "motorR3");
        motorR4 = hardwareMap.get(DcMotor.class , "motorR4");

        motorR3.setDirection(DcMotorSimple.Direction.REVERSE);
        motorR4.setDirection(DcMotorSimple.Direction.REVERSE);


        motorL1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorL2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();

        while(opModeIsActive() && motorL1.isBusy() && motorL2.isBusy() && motorR3.isBusy() && motorR4.isBusy()) {

            motorL1.setTargetPosition(tickTarget);
            motorL2.setTargetPosition(tickTarget);
            motorR3.setTargetPosition(tickTarget);
            motorR4.setTargetPosition(tickTarget);

            motorL1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorL2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorR3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorR4.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            motorL1.setPower(1);
            motorL2.setPower(1);
            motorR3.setPower(1);
            motorR4.setPower(1);

        }

        motorL1.setPower(0);
        motorL2.setPower(0);
        motorR3.setPower(0);
        motorR4.setPower(0);
    }


}
