package com.example.jiekouhuidian;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationBar main_bnb;
    private RadioButton main_rb1;
    private RadioButton main_rb3;
    private RadioButton main_rb2;
    private RadioGroup main_rg;
    private ViewPager main_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initid();
       initview();


    }

    private void initview() {

        Log.d("aaa","期开爱");
    }

    private void initid() {
        main_rb1 = findViewById(R.id.main_rb1);
        main_rb2 = findViewById(R.id.main_rb2);
        main_rb3 = findViewById(R.id.main_rb3);
        main_rg = findViewById(R.id.main_rg);
        main_vp = findViewById(R.id.main_vp);
    }


}
