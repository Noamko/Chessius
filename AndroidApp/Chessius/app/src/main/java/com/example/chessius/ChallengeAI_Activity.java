package com.example.chessius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
public class ChallengeAI_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge_ai);
    }

    public void createGame() {
        StringRequest stringRequest;
        RequestQueue requestQueue;
    }
}