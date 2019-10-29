package videoview.example.com.vedioshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        VideoView play= (VideoView) findViewById(R.id.videoView);
        play.setVideoPath("android.resource://" + getPackageName() +"/" + R.raw.bdcricket);

        MediaController media=new MediaController(this);
        media.setAnchorView(play);

       play.setMediaController(media);
        play.start();
    }
}
