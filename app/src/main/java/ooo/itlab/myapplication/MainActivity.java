package ooo.itlab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;


public class MainActivity extends AppCompatActivity  {
        Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.button2);
        button=(Button) findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch1();
            }
        });
    }

    private void launchActivity() {

        Intent intent = new Intent(this, Courses.class);
        startActivity(intent);
    }
    private  void launch1(){
        Intent intent=new Intent(this,registration.class);
        startActivity(intent);
    }
}
