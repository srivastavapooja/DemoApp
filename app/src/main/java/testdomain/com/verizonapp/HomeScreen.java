package testdomain.com.verizonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void GotoTextScreen(View v){
        Intent intent = new Intent(this,TextScreen.class);
        startActivity(intent);
    }

    public void GotoMathScreen(View v){
        Intent intent = new Intent(this,MathScreen.class);
        startActivity(intent);
    }

    public void GotoAnimationScreen(View v){
        Intent intent = new Intent(this,OpenGLActivity.class);
        startActivity(intent);
    }
}
