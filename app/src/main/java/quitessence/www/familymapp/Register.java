package quitessence.www.familymapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    /** Called when the user taps the "Register" button */
    public void Register_mthd(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Test PHP Register Script", Toast.LENGTH_SHORT);
        toast.show();
    }


    /** Called when the user taps the "Quick Start Guide" button */
        public void QuickStartGuide_mthd(View view) {
        Intent intent = new Intent(this, QuickStartGuide.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the "Need Help?" link */
    public void NeedHelp_mthd(View view) {
        Intent intent = new Intent(this, Help.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
