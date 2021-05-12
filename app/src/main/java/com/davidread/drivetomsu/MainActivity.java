package com.davidread.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This activity class represents an instructions screen. It displays instructions on how the app
 * works and has a drive button for starting turn-by-turn navigation to MSU.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Called when the activity is initially created. It inflates a layout and sets a click listener
     * for the drive button.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate main layout.
        setContentView(R.layout.activity_main);

        // Setup click listener for drive button.
        Button buttonDrive = findViewById(R.id.button_drive);
        buttonDrive.setOnClickListener(this);
    }

    /**
     * Handles clicks for the drive button. Sends an explicit intent to Google Maps to launch turn-
     * by-turn navigation to MSU.
     */
    @Override
    public void onClick(View v) {
        String destination = "Montclair+State+University,+New+Jersey,+United+States";
        Uri uri = Uri.parse("google.navigation:q=" + destination);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}