package com.example.adaptivecalccherepanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView mSwitchModeBtn;
    private static FrameLayout mEngineerBtns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mSwitchModeBtn = findViewById(R.id.switchModeTxtView);
        mEngineerBtns = findViewById(R.id.engineerView);

        mSwitchModeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mEngineerBtns.getVisibility()) {
                    case View.VISIBLE :
                        mEngineerBtns.setVisibility(View.GONE);
                        break;

                    case View.GONE :
                        mEngineerBtns.setVisibility(View.VISIBLE);
                        break;

                    default:break;
                }
            }
        });
    }
}
