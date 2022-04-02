package com.example.chessius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.felhr.usbserial.UsbSerialDevice;

import me.aflak.arduino.Arduino;
import me.aflak.arduino.ArduinoListener;

public class MainActivity extends AppCompatActivity {
    Arduino arduino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void challengeAI(View view) {
        Intent intent = new Intent(this, ChallengeAI_Activity.class);
//        startActivity(intent);
    }
}