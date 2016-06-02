package com.example.tony.testwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Animation mPatOneToTwoAni;
    private Animation mPatTwoToOneAni;
    private Animation mPatTwoToThreeAni;
    private Animation mPatThreeToTwoAni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAnimation();
        final WebView bookWebview = (WebView) findViewById(R.id.bookWebview);
        bookWebview.loadUrl("file:///android_asset/55PUF6850/Connect_your_TV/Connect_antenna/description.html");
        Button button1 = (Button)findViewById(R.id.botton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookWebview.startAnimation(mPatOneToTwoAni);
            }
        });

    }

    private void initAnimation()
    {
        this.mPatOneToTwoAni = new TranslateAnimation(0.0F, -514.0F, 0.0F, 0.0F);
        this.mPatOneToTwoAni.setDuration(500L);
        //this.mPatOneToTwoAni.setAnimationListener(this.mPatOneToTwoAniListener);
        this.mPatTwoToOneAni = new TranslateAnimation(0.0F, 514.0F, 0.0F, 0.0F);
        this.mPatTwoToOneAni.setDuration(500L);
        //this.mPatTwoToOneAni.setAnimationListener(this.mPatTwoToOneAniListener);
        this.mPatTwoToThreeAni = new TranslateAnimation(0.0F, -532.0F, 0.0F, 0.0F);
        this.mPatTwoToThreeAni.setDuration(500L);
        //this.mPatTwoToThreeAni.setAnimationListener(this.mPatTwoToThreeAniListener);
        this.mPatThreeToTwoAni = new TranslateAnimation(0.0F, 532.0F, 0.0F, 0.0F);
        this.mPatThreeToTwoAni.setDuration(500L);
        //this.mPatThreeToTwoAni.setAnimationListener(this.mPatThreeToTwoAniListener);
    }
}
