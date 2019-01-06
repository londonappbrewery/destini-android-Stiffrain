package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryTextView;

    int mStoryNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mBottomButton = findViewById(R.id.buttonBottom);
        mTopButton = findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryNumber){
                    case 1: {
                        mStoryNumber = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        break;
                    }
                    case 2: {
                        mStoryNumber = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        break;
                    }
                    case 3: {
                        mStoryNumber = 6;
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        break;
                    }
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryNumber){
                    case 1: {
                        mStoryNumber = 2;
                        mStoryTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        break;
                    }
                    case 2: {
                        mStoryNumber = 4;
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        break;
                    }
                    case 3: {
                        mStoryNumber = 5;
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        break;
                    }
                }
            }
        });
    }
}
