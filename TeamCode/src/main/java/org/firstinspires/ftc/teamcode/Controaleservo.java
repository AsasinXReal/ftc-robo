package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
    public class Controaleservo extends OpMode {

        public Servo servo1;

        public void init(){

            servo1 = hardwareMap.get(Servo.class , "servobrat");
            servo1.setPosition(0.5);
        }

        public void loop() {

            if(gamepad1.a){
                servo1.setPosition(1);}
            else if (gamepad1.b){
                servo1.setPosition(0);}
            else if (gamepad1.x){
                servo1.setPosition(0.5);
            }


        }


    

}
