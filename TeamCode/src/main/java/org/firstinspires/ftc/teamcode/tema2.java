package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous(name="encoder1")
public class tema2 extends LinearOpMode {

    DcMotor motorL1;
    DcMotor motorL2;
    DcMotor motorR1;
    DcMotor motorR2;
    int tickTarget = 5000;

    @Override
    public void runOpMode(){
        motorL1 = hardwareMap.get(DcMotor.class, "motorL1");
        motorL2 = hardwareMap.get(DcMotor.class , "motorL2");
        motorR1 = hardwareMap.get(DcMotor.class , "motorR3");
        motorR2 = hardwareMap.get(DcMotor.class , "motorR4");

        motorR1.setDirection(DcMotorSimple.Direction.REVERSE);
        motorR2.setDirection(DcMotorSimple.Direction.REVERSE);


        motorL1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorL2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorR2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        waitForStart();

            motorL1.setTargetPosition(tickTarget);
            motorL2.setTargetPosition(tickTarget);
            motorR1.setTargetPosition(tickTarget);
            motorR2.setTargetPosition(tickTarget);

            motorL1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorL2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorR1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            motorR2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            motorL1.setPower(1);
            motorL2.setPower(1);
            motorR1.setPower(1);
            motorR2.setPower(1);

            while(opModeIsActive() && motorL1.isBusy() && motorL2.isBusy() && motorR1.isBusy() && motorR2.isBusy())
            {   telemetry.addData("Pozitie" , motorL1.getCurrentPosition());
                telemetry.addData("Pozitie" , motorL2.getCurrentPosition());
                telemetry.addData("Pozitie" , motorR1.getCurrentPosition());
                telemetry.addData("Pozitie" , motorR2.getCurrentPosition());

            }
        motorL1.setPower(0);
        motorL2.setPower(0);
        motorR1.setPower(0);
        motorR2.setPower(0);
    }


}
