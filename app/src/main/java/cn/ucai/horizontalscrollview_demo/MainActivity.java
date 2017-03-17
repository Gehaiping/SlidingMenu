package cn.ucai.horizontalscrollview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    SlidingMenu mSlidingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlidingMenu = (SlidingMenu) findViewById(R.id.slidingMenu);
    }

    public void onClick(View view) {
        mSlidingMenu.toggle();
    }
}
