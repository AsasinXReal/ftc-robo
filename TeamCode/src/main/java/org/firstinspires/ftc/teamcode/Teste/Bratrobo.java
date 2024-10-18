package org.firstinspires.ftc.teamcode.Teste;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Bratrobo")
public class Bratrobo extends OpMode {

    private CRServo servomatura;
    DcMotor motorbrat;
    
    public void init(){

        servomatura = hardwareMap.get(CRServo.class , "servomatura");
        motorbrat = hardwareMap.get(DcMotor.class , "motorbrat");

        motorbrat.setDirection(DcMotorSimple.Direction.REVERSE); //motorul ii pozitionat invers , iar bratul trebuie fi dat peste cap si daia am dat reverse
    }

    public void loop(){
//
        if(gamepad1.triangle)
            servomatura.setPower(1);

        if(gamepad1.circle)
            servomatura.setPower(-1);

    }


}
