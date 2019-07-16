package com.example.enotita_6_11;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.sound);

        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.isPlaying()) {
                    button.setText("Play");
                    player.pause();
                }
                else {
                    button.setText("Pause");
                    player.start();
                }
            }
        });
    }
}
