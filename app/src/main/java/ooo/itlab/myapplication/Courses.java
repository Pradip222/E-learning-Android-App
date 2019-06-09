package ooo.itlab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.content.Intent;
import android.widget.Button;

public class Courses extends AppCompatActivity  {
    Button buttonAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        buttonAndroid=(Button) findViewById(R.id.buttonAndroid);
        buttonAndroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                callAndroid();
            }
        });

    }
    private void callAndroid(){

        Intent intent=new Intent(this,Android.class);
        startActivity(intent);
    }

}
