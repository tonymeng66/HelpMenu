package com.example.tony.testwebview;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.tony.testwebview.helper.HelpList;
import com.example.tony.testwebview.helper.ListItem;
import com.example.tony.testwebview.testHelper.ArrayAdapterItem;
import com.example.tony.testwebview.testHelper.ObjectItem;
import com.example.tony.testwebview.tools.Constants;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WebView mBookWebview;
    private ImageView mDivider1;
    private ImageView mDivider2;
    private ImageView mDivider3;
    private Button mButton1;
    private Button mButton2;
    private ListView mRootList;
    private ListView mListBook1;
    private ListView mListBook2;
//    private XmicListAdapter mLevelOneAdapter;
//    private XmicListItemAdapter mLevelTwoAdapter;
    private ArrayAdapterItem mRootListAdapter;
    private ArrayAdapterItem mLevelOneAdapter;
    private ArrayAdapterItem mLevelTwoAdapter;
    private List<HelpList> bookLists = null;
    private List<ListItem> itemBooks;
    private ObjectItem[] mListBook1Data = new ObjectItem[10];
    private ObjectItem[] mListBook2Data = new ObjectItem[10];
    private ObjectItem[] mRootListData= new ObjectItem[2];

    static final float ANIMATION_LEFT = -500.0F;
    static final float ANIMATION_RIGHT = 500.0F;
    static final long ANIMATION_DURATION = 500L;

    static final int PAT2_DIVIDER1_LEFT_MARGIN = 100;
    static final int PAT2_DIVIDER2_LEFT_MARGIN = 400;
    static final int PAT2_LISTBOOK1_LEFT_MARGIN = 103;
    static final int PAT2_LISTBOOK2_LEFT_MARGIN = 403;
    static final int PAT2_WEBVIEW_LEFT_MARGIN = 600;

    static final int PAT3_DIVIDER1_LEFT_MARGIN = 0;
    static final int PAT3_DIVIDER2_LEFT_MARGIN = 100;
    static final int PAT3_LISTBOOK1_LEFT_MARGIN = 0;
    static final int PAT3_LISTBOOK2_LEFT_MARGIN = 103;
    static final int PAT3_WEBVIEW_LEFT_MARGIN = 200;





    View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:

                    AnimatorSet set1 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_rootlist);
                    set1.setTarget(mRootList);
                    set1.start();

                    AnimatorSet set2 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_divider1);
                    set2.setTarget(mDivider1);
                    set2.start();

                    AnimatorSet set3 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_divider2);
                    set3.setTarget(mDivider2);
                    set3.start();

                    AnimatorSet set4 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_divider3);
                    set4.setTarget(mDivider3);
                    set4.start();

                    AnimatorSet set5 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_mlistbook1);
                    set5.setTarget(mListBook1);
                    set5.start();
//
                    AnimatorSet set6 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_mlistbook2);
                    set6.setTarget(mListBook2);
                    set6.start();
//
                    AnimatorSet set7 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat2to3_webview);
                    set7.setTarget(mBookWebview);
                    set7.start();

                    mBookWebview.setVisibility(View.VISIBLE);
                    mDivider3.setVisibility(View.VISIBLE);


                    break;
                case R.id.button2:
                    AnimatorSet set8 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_rootlist);
                    set8.setTarget(mRootList);
                    set8.start();

                    AnimatorSet set9 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_divider1);
                    set9.setTarget(mDivider1);
                    set9.start();

                    AnimatorSet set10 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_divider2);
                    set10.setTarget(mDivider2);
                    set10.start();

                    AnimatorSet set11 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_divider3);
                    set11.setTarget(mDivider3);
                    set11.start();
//
                    AnimatorSet set12 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_mlistbook1);
                    set12.setTarget(mListBook1);
                    set12.start();
//
                    AnimatorSet set13 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_mlistbook2);
                    set13.setTarget(mListBook2);
                    set13.start();
//
                    AnimatorSet set14 = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.pat3to2_webview);
                    set14.setTarget(mBookWebview);
                    set14.start();

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
                mRootList.setVisibility(View.GONE);
                mDivider1.setLayoutParams(mPatThreeDeviderOneParams);
                mDivider2.setLayoutParams(mPatThreeDeviderTwoParams);

                mListBook1.setVisibility(View.GONE);
                //mListBook2.requestFocus();
                mListBook2.setLayoutParams(mPatThreeLevelTwoParams);
                mBookWebview.setVisibility(View.VISIBLE);
                mBookWebview.setLayoutParams(mPatThreeWebConParams);
//                HelpActivity.this.loadUrlWithoutFocus(HelpActivity.this.mListBook2.getSelectedItemPosition());
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
            mRootList.setVisibility(View.VISIBLE);
            mDivider1.setLayoutParams(mPatTwoDeviderOneParams);
            mDivider2.setLayoutParams(mPatTwoDeviderTwoParams);
            mListBook1.setVisibility(View.VISIBLE);
            //mListBook1.requestFocus();
            mListBook1.setLayoutParams(mPatTwoLevelOneParams);
            mListBook2.setLayoutParams(mPatTwoLevelTwoParams);
//
////            HelpActivity.this.mListBook2.setLayoutParams(HelpActivity.this.mPatTwoLevelTwoParams);
            mBookWebview.setVisibility(View.GONE);
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


        //initAnimation();
        initComponetLp();
        makeFakeData();
        findViews();
    }

    private void makeFakeData(){

        mListBook1Data[0] = new ObjectItem(91, "Mercury1");
        mListBook1Data[1] = new ObjectItem(92, "Watson1");
        mListBook1Data[2] = new ObjectItem(93, "Nissan1");
        mListBook1Data[3] = new ObjectItem(94, "Puregold1");
        mListBook1Data[4] = new ObjectItem(95, "SM1");
        mListBook1Data[5] = new ObjectItem(96, "7 Eleven1");
        mListBook1Data[6] = new ObjectItem(97, "Ministop1");
        mListBook1Data[7] = new ObjectItem(98, "Fat Chicken1");
        mListBook1Data[8] = new ObjectItem(99, "Master Siomai1");
        mListBook1Data[9] = new ObjectItem(100, "Mang Inasal1");

        mListBook2Data[0] = new ObjectItem(91, "Mercury2");
        mListBook2Data[1] = new ObjectItem(92, "Watson2");
        mListBook2Data[2] = new ObjectItem(93, "Nissan2");
        mListBook2Data[3] = new ObjectItem(94, "Puregold2");
        mListBook2Data[4] = new ObjectItem(95, "SM2");
        mListBook2Data[5] = new ObjectItem(96, "7 Eleven2");
        mListBook2Data[6] = new ObjectItem(97, "Ministop2");
        mListBook2Data[7] = new ObjectItem(98, "Fat Chicken2");
        mListBook2Data[8] = new ObjectItem(99, "Master Siomai2");
        mListBook2Data[9] = new ObjectItem(100, "Mang Inasal2");

        mRootListData[0] = new ObjectItem(1,"目录");
        mRootListData[1] = new ObjectItem(2,"列表");
    }

    private void findViews()
    {

        mDivider1 = (ImageView)findViewById(R.id.bookDividerOne);
        mDivider2 = (ImageView)findViewById(R.id.bookDividerTwo);
        mDivider3 = (ImageView)findViewById(R.id.bookDividerThree);
        mButton1 = (Button)findViewById(R.id.button1);
        mButton1.setOnClickListener(buttonClickListener);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton2.setOnClickListener(buttonClickListener);

        mRootList = (ListView) findViewById(R.id.root_list);
        mRootListAdapter = new ArrayAdapterItem(this,R.layout.list_view_row_item, mRootListData);
        mRootList.setAdapter(mRootListAdapter);


        mListBook1 = (ListView) findViewById(R.id.listBookLevelOne);
        mLevelOneAdapter = new ArrayAdapterItem(this,R.layout.list_view_row_item, mListBook1Data);
        mListBook1.setAdapter(mLevelOneAdapter);

        mListBook2 = (ListView) findViewById(R.id.listBookLevelTwo);
        mLevelTwoAdapter = new ArrayAdapterItem(this,R.layout.list_view_row_item, mListBook2Data);
        mListBook2.setAdapter(mLevelTwoAdapter);

        mBookWebview = (WebView)findViewById(R.id.bookWebview);
        mBookWebview.setBackgroundColor(0);
        mBookWebview.loadUrl("file:///android_asset/55PUF6850/Connect_your_TV/Connect_antenna/description.html");

      //  mListBook2 = (ListView) findViewById(R.id.listBookLevelTwo);
//        mLevelTwoAdapter = new XmicListItemAdapter(this, R.layout.list_item, itemBooks);

       // mLevelTwoAdapter.setItems(itemBooks);
       // mListBook2.setAdapter(mLevelTwoAdapter);
    }


    private void initAnimation()
    {
        this.mPatOneToTwoAni = new TranslateAnimation(0.0F, ANIMATION_RIGHT, 0.0F, 0.0F);
        this.mPatOneToTwoAni.setDuration(ANIMATION_DURATION);
        //this.mPatOneToTwoAni.setAnimationListener(this.mPatOneToTwoAniListener);
        this.mPatTwoToOneAni = new TranslateAnimation(0.0F, ANIMATION_LEFT, 0.0F, 0.0F);
        this.mPatTwoToOneAni.setDuration(ANIMATION_DURATION);
        //this.mPatTwoToOneAni.setAnimationListener(this.mPatTwoToOneAniListener);
        this.mPatTwoToThreeAni = new TranslateAnimation(0.0F, ANIMATION_LEFT, 0.0F, 0.0F);
        this.mPatTwoToThreeAni.setDuration(ANIMATION_DURATION);
        this.mPatTwoToThreeAni.setAnimationListener(mPatTwoToThreeAniListener);
        this.mPatThreeToTwoAni = new TranslateAnimation(0.0F, ANIMATION_RIGHT,0.0F, 0.0F);
        this.mPatThreeToTwoAni.setDuration(ANIMATION_DURATION);
        this.mPatThreeToTwoAni.setAnimationListener(mPatThreeToTwoAniListener);
    }

    private void initComponetLp()
    {
//        this.mPatOneDeviderTwoParams = new RelativeLayout.LayoutParams(-2, -2);
//        this.mPatOneDeviderTwoParams.leftMargin = 520;
//        this.mPatOneLevelOneParams = new RelativeLayout.LayoutParams(Constants.lvOneWidth, Constants.lvDisplayHeight);
//        this.mPatOneLevelOneParams.leftMargin = 538;


        mPatTwoDeviderOneParams = new RelativeLayout.LayoutParams(-1,-1);
        mPatTwoDeviderOneParams.leftMargin = PAT2_DIVIDER1_LEFT_MARGIN;
        mPatTwoLevelOneParams = new RelativeLayout.LayoutParams(370, Constants.lvDisplayHeight);
        mPatTwoLevelOneParams.leftMargin = PAT2_LISTBOOK1_LEFT_MARGIN;
        mPatTwoDeviderTwoParams = new RelativeLayout.LayoutParams(-1, -1);
        mPatTwoDeviderTwoParams.leftMargin = PAT2_DIVIDER2_LEFT_MARGIN;
        mPatTwoLevelTwoParams = new RelativeLayout.LayoutParams(316, Constants.lvDisplayHeight);
        mPatTwoLevelTwoParams.leftMargin = PAT2_LISTBOOK2_LEFT_MARGIN;
        mPatTwoWebConParams = new RelativeLayout.LayoutParams(1134, 640);
        mPatTwoWebConParams.leftMargin = PAT2_WEBVIEW_LEFT_MARGIN;


        mPatThreeDeviderOneParams = new RelativeLayout.LayoutParams(-1, -1);
        mPatThreeDeviderOneParams.leftMargin = PAT3_DIVIDER1_LEFT_MARGIN;
        mPatThreeLevelOneParams = new RelativeLayout.LayoutParams(370, Constants.lvDisplayHeight);
        mPatThreeLevelOneParams.leftMargin = PAT3_LISTBOOK1_LEFT_MARGIN;
        mPatThreeLevelTwoParams = new RelativeLayout.LayoutParams(316, Constants.lvDisplayHeight);
        mPatThreeLevelTwoParams.leftMargin = PAT3_LISTBOOK2_LEFT_MARGIN;
        mPatThreeDeviderTwoParams = new RelativeLayout.LayoutParams(-1, -1);
        mPatThreeDeviderTwoParams.leftMargin = PAT3_DIVIDER2_LEFT_MARGIN;
        mPatThreeWebConParams = new RelativeLayout.LayoutParams(1134, 640);
        mPatThreeWebConParams.leftMargin = PAT3_WEBVIEW_LEFT_MARGIN;
    }

}
