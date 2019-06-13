package ooo.itlab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.content.Intent;
import android.widget.Button;

public class Profile extends AppCompatActivity  {
    Button button,button2,button3,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                callAndroid();
            }
        });
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                callAndroid1();
            }
        });

        button3=(Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                callAndroid2();
            }
        });
        button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                callAndroid4();
            }
        });
    }
    private void callAndroid(){

        Intent intent=new Intent(this,Courses.class);
        startActivity(intent);
    }
    private void callAndroid1(){

        Intent intent=new Intent(this,Ass_details_screen.class);
        startActivity(intent);
    }
    private void callAndroid2(){

        Intent intent=new Intent(this,change_pwd.class);
        startActivity(intent);
    }

    private void callAndroid4(){

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
