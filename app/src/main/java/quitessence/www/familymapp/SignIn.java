package quitessence.www.familymapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    /** Called when the user taps the "New to Family mApp?. Sign up now? */
    public void Register_mthd(View view) {
         Intent intent = new Intent(this, Register.class);
         //EditText editText = (EditText) findViewById(R.id.editText);
         //String message = editText.getText().toString();
         //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        }

    /** Called when the user taps the "Sign In" button */
    public void SignIn_mthd(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Test PHP Sign In Script", Toast.LENGTH_SHORT);
        toast.show();
    }

    /** Called when the user taps the "Go To Main Activity" button */
    public void GoToMain_mthd(View view) {
        Intent intent = new Intent(this, MainActivity.class);
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
