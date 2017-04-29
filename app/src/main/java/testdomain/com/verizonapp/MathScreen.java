package testdomain.com.verizonapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

import testdomain.com.depmodule.DepClass;

public class MathScreen extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }
    private EditText numberField;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_screen2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        numberField = (EditText) findViewById(R.id.num);
        answer = (TextView) findViewById(R.id.integer_sq);
        Log.d("answer" , answer.getText().toString());

        Button getsq = (Button) findViewById(R.id.btn_getSq);
        getsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = MathScreen.this.numberField.getText().toString();
                int val = Integer.parseInt(a);
                DepClass dep1 = new DepClass();
                int num = dep1.getSquareValueFromJNI(val);
                MathScreen.this.numberField.clearFocus();
                MathScreen.this.answer.setText("The Square of " + a + " is " + Integer.toString(num));
                Toast.makeText(MathScreen.this, MathScreen.this.answer.getText(), Toast.LENGTH_LONG).show();

            }
        });

    }

}
