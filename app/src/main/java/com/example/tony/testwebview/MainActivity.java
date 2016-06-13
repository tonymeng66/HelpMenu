package com.example.tony.testwebview;

import android.annotation.TargetApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.tony.testwebview.tools.Constants;

public class MainActivity extends AppCompatActivity {

    private WebView mBookWebview;
    private ImageView mDivider1;
    private ImageView mDivider2;
    private Button mButton1;
    private Button mButton2;
    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    mBookWebview.startAnimation(mPatTwoToThreeAni);
                    mDivider1.startAnimation(mPatTwoToThreeAni);
                    mDivider2.startAnimation(mPatTwoToThreeAni);
                    break;
                case R.id.button2:
                    mBookWebview.startAnimation(mPatThreeToTwoAni);
                    mDivider1.startAnimation(mPatThreeToTwoAni);
                    mDivider2.startAnimation(mPatThreeToTwoAni);
                    break;
                default:
                    break;
            }
        }
    };


    private Animation mPatOneToTwoAni;
    private Animation mPatTwoToOneAni;
    private Animation mPatTwoToThreeAni;
    private Animation mPatThreeToTwoAni;

    Animation.AnimationListener mPatTwoToThreeAniListener = new Animation.AnimationListener()
    {
        public void onAnimationEnd(Animation paramAnimation)
        {
//            HelpActivity.this.listBookLevelOneName.setVisibility(0);
//            int i;
//            if (HelpActivity.this.bookLists.size() > HelpActivity.this.lBookOneSelectedPosition)
//            {
//                i = HelpActivity.this.lBookOneSelectedPosition;
//                if (HelpActivity.this.mCurType != 1)
//                    break label248;
//                HelpActivity.this.listRootName.setText(HelpActivity.this.getString(2131427342), HelpActivity.this.getResources().getColor(2131230944));
//                HelpActivity.this.listBookLevelOneName.setText(((HelpList)HelpActivity.this.bookLists.get(i)).getIndexName(), HelpActivity.this.getResources().getColor(2131230943));
//            }
//            while (true)
//            {
                mDivider1.setLayoutParams(mPatThreeDeviderOneParams);
                mDivider2.setLayoutParams(mPatThreeDeviderTwoParams);

//                HelpActivity.this.listViewBookOne.setVisibility(4);
//                HelpActivity.this.listViewBookTwo.requestFocus();
//                HelpActivity.this.listViewBookTwo.setLayoutParams(HelpActivity.this.mPatThreeLevelTwoParams);
                mBookWebview.setVisibility(View.VISIBLE);
                mBookWebview.setLayoutParams(mPatThreeWebConParams);
//                HelpActivity.this.loadUrlWithoutFocus(HelpActivity.this.listViewBookTwo.getSelectedItemPosition());
//                return;
//                i = 0;
//                break;
//                label248: HelpActivity.this.listRootName.setText(HelpActivity.this.getString(2131427341), HelpActivity.this.getResources().getColor(2131230944));
//                HelpActivity.this.listBookLevelOneName.setText(((HelpList)HelpActivity.this.listsOriginal.get(i)).getIndexName(), HelpActivity.this.getResources().getColor(2131230943));
//            }
        }

        public void onAnimationRepeat(Animation paramAnimation)
        {
        }

        public void onAnimationStart(Animation paramAnimation)
        {
        }
    };
    Animation.AnimationListener mPatThreeToTwoAniListener = new Animation.AnimationListener()
    {
        public void onAnimationEnd(Animation paramAnimation)
        {
            mDivider1.setLayoutParams(mPatTwoDeviderOneParams);
//            HelpActivity.this.listViewBookOne.setVisibility(0);
//            HelpActivity.this.listViewBookOne.requestFocus();
//            HelpActivity.this.listViewBookOne.setLayoutParams(HelpActivity.this.mPatTwoLevelOneParams);
            mDivider2.setLayoutParams(mPatTwoDeviderTwoParams);
//            HelpActivity.this.listViewBookTwo.setLayoutParams(HelpActivity.this.mPatTwoLevelTwoParams);
            //mBookWebview.setVisibility(View.INVISIBLE);
            mBookWebview.setLayoutParams(mPatTwoWebConParams);
//            HelpActivity.this.mWebViewScrollbarBg.setVisibility(4);
//            HelpActivity.this.mWebViewScrollbarWhiteThumb.setVisibility(4);
        }

        public void onAnimationRepeat(Animation paramAnimation)
        {
        }

        public void onAnimationStart(Animation paramAnimation)
        {
        }
    };


    private RelativeLayout.LayoutParams mPatOneDeviderOneParams;
    private RelativeLayout.LayoutParams mPatOneDeviderTwoParams;
    private RelativeLayout.LayoutParams mPatOneLevelOneParams;
    private RelativeLayout.LayoutParams mPatOneLevelRootParams;
    private RelativeLayout.LayoutParams mPatOnewLevelTwoParams;
    private RelativeLayout.LayoutParams mPatThreeDeviderOneParams;
    private RelativeLayout.LayoutParams mPatThreeDeviderTwoParams;
    private RelativeLayout.LayoutParams mPatThreeLevelOneParams;
    private RelativeLayout.LayoutParams mPatThreeLevelRootParams;
    private RelativeLayout.LayoutParams mPatThreeLevelTwoParams;
    private RelativeLayout.LayoutParams mPatThreeWebConParams;
    private RelativeLayout.LayoutParams mPatTwoDeviderOneParams;
    private RelativeLayout.LayoutParams mPatTwoDeviderTwoParams;
    private RelativeLayout.LayoutParams mPatTwoLevelOneParams;
    private RelativeLayout.LayoutParams mPatTwoLevelRootParams;
    private RelativeLayout.LayoutParams mPatTwoLevelTwoParams;
    private RelativeLayout.LayoutParams mPatTwoWebConParams;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAnimation();
        initComponetLp();
        findViews();
    }

    private void findViews()
    {
        mBookWebview = (WebView)findViewById(R.id.bookWebview);
        mBookWebview.loadUrl("file:///android_asset/55PUF6850/Connect_your_TV/Connect_antenna/description.html");
        mDivider1 = (ImageView)findViewById(R.id.bookDividerOne);
        mDivider2 = (ImageView)findViewById(R.id.bookDividerTwo);
        mButton1 = (Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(buttonClickListener);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(buttonClickListener);
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
        this.mPatTwoToThreeAni.setAnimationListener(mPatTwoToThreeAniListener);
        this.mPatThreeToTwoAni = new TranslateAnimation(0.0F, 532.0F, 0.0F, 0.0F);
        this.mPatThreeToTwoAni.setDuration(500L);
        this.mPatThreeToTwoAni.setAnimationListener(mPatThreeToTwoAniListener);
    }

    private void initComponetLp()
    {
//        this.mPatOneDeviderTwoParams = new RelativeLayout.LayoutParams(-2, -2);
//        this.mPatOneDeviderTwoParams.leftMargin = 520;
//        this.mPatOneLevelOneParams = new RelativeLayout.LayoutParams(Constants.lvOneWidth, Constants.lvDisplayHeight);
//        this.mPatOneLevelOneParams.leftMargin = 538;


        this.mPatTwoDeviderOneParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mPatTwoDeviderOneParams.leftMargin = 108;
//        this.mPatTwoLevelOneParams = new RelativeLayout.LayoutParams(370, Constants.lvDisplayHeight);
//        this.mPatTwoLevelOneParams.leftMargin = 124;
        this.mPatTwoDeviderTwoParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mPatTwoDeviderTwoParams.leftMargin = 606;
//        this.mPatTwoLevelTwoParams = new RelativeLayout.LayoutParams(316, Constants.lvDisplayHeight);
//        this.mPatTwoLevelTwoParams.leftMargin = 624;
        this.mPatTwoWebConParams = new RelativeLayout.LayoutParams(1134, 640);
        this.mPatTwoWebConParams.leftMargin = 1226;


        this.mPatThreeDeviderOneParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mPatThreeDeviderOneParams.leftMargin = 646;
//        this.mPatThreeLevelTwoParams = new RelativeLayout.LayoutParams(316, Constants.lvDisplayHeight);
//        this.mPatThreeLevelTwoParams.leftMargin = 192;
        this.mPatThreeDeviderTwoParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mPatThreeDeviderTwoParams.leftMargin = 604;
        this.mPatThreeWebConParams = new RelativeLayout.LayoutParams(1134, 640);
        this.mPatThreeWebConParams.leftMargin = 506;
    }

}
