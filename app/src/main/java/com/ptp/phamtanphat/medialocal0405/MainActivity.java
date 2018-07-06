package com.ptp.phamtanphat.medialocal0405;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import java.text.SimpleDateFormat;

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

        btnPlayMp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.dungnhumotthoiquen);

//                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm : ss");
//                Log.d("BBB","Tong gian thoi gian " + simpleDateFormat.format(mediaPlayer.getDuration()));
//                Log.d("BBB","Thoi gian bai hat dang chay " + mediaPlayer.getCurrentPosition());

                mediaPlayer.start();
            }
        });
        btnPlayMp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.girlslikeyou));
                videoView.start();
            }
        });
    }
}
