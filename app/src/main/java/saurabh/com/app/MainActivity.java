package saurabh.com.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import saurabh.com.library.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLibrary.getInstance().showToast(this,"Saurabh");
    }
}