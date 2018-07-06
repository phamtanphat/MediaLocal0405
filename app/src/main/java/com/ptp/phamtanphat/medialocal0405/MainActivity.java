package com.ptp.phamtanphat.medialocal0405;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button btnPlayMp3,btnPlayMp4;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayMp3 = findViewById(R.id.buttonPlayMp3);
        btnPlayMp4 = findViewById(R.id.buttonPlayMp4);
        videoView = findViewById(R.id.videoview);
    }
}
