package org.firstinspires.ftc.teamcode.Teste;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "controalemoto")
public class Controalemotore extends OpMode {

    DcMotor motorL1;
    DcMotor motorL2;
    DcMotor motorR1;
    DcMotor motorR2;

    @Override
    public void init(){
    motorL1 = hardwareMap.get(DcMotor.class , "motorstanga1");
    motorL2 = hardwareMap.get(DcMotor.class , "motorstanga2");
    motorR1 = hardwareMap.get(DcMotor.class , "motordrapta1");
    motorR2 = hardwareMap.get(DcMotor.class , "motordrapta2");

    motorR1.setDirection(DcMotorSimple.Direction.REVERSE);
    motorR2.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop(){
        double forward = -gamepad1.left_stick_y;
        double turn = gamepad1.left_stick_x;

        forward = Range.clip(forward, -1 , 1);
        turn = Range.clip(turn, -1 , 1);

        motorR1.setPower(Range.clip(forward + turn, -1, 1));
        motorR2.setPower(Range.clip(forward + turn, -1, 1));
        motorL1.setPower(Range.clip(forward - turn, -1, 1));
        motorL2.setPower(Range.clip(forward - turn, -1, 1));

        telemetry.addData("forward", forward);
        telemetry.addData("turn" , turn);
        telemetry.update();


    }

}
