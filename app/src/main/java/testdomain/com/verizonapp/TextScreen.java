package testdomain.com.verizonapp;

import android.os.Bundle;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import testdomain.com.depmodule.DepClass;

public class TextScreen extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tv = (TextView) findViewById(R.id.jni_string);

         tv.setText(getMessageFromJNI());
    }
    private void callback(int a) {

        System.out.println("In Java callback TextScreen");
        System.out.println(a);
    }

    public native String getMessageFromJNI();
}
