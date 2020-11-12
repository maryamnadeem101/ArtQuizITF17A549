package application.assignment.quizbitf17a549;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Activity5 extends AppCompatActivity {
    // setting up things
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    Button next_button;
    RadioButton optionA, optionB, optionC, optionD;
    View v;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity5xml);

        radioGroup = findViewById(R.id.radioGroup);
        next_button =(Button)findViewById(R.id.next_button);

        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

    }

    //when check button is clicked
    public void checkQuestion(View view)
    {
        String correctoption = "";
        if(radioGroup.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), "No button checked", Toast.LENGTH_LONG).show();
        }

        else
        {
            if(optionA.isChecked())
            {
                correctoption = "False";
            }
            if (optionB.isChecked())
            {
                correctoption = "False";
            }
            if(optionC.isChecked()) {
                correctoption = "True";
            }
            if(optionD.isChecked()) {
                correctoption = "False";
            }
        }
        Toast.makeText(getApplicationContext(), correctoption, Toast.LENGTH_LONG).show();
    }
    //when next button is clicked

    public void goToNextActivity(View view1) {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }


}