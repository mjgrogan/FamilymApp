package quitessence.www.familymapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignIn extends AppCompatActivity {

    private TextInputLayout Username_til, Password_til;
    private EditText Username_et, Password_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initializeWidgets();
    }

    private void initializeWidgets() {
        Username_til = (TextInputLayout) findViewById(R.id.tilUsername);
        Username_et = (EditText) findViewById(R.id.etUsername);
        Password_til = (TextInputLayout) findViewById(R.id.tilPassword);
        Password_et = (EditText) findViewById(R.id.etPassword);
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

        /** Used to confirm SignIn_mthd call / Username and Password validation code
        Toast toastvalidation = Toast.makeText(getApplicationContext(), "Test Username and Password validation code", Toast.LENGTH_SHORT);
        toastvalidation.show();
        */

        boolean isUsernameValid = true;
        if(Username_et.getText().toString().trim().length() < 6) {
            Username_til.setError("Username is too short (must be a minimum of 6 characters). Please try again...");
            isUsernameValid = false;
        } else {
            Username_til.setErrorEnabled(false);
        }
        boolean isPasswordValid = true;
        if(Password_et.getText().toString().trim().length() < 6) {
            Password_til.setError("Password is too short (must be a minimum of 6 characters). Please try again...");
            isPasswordValid = false;
        } else {
            Password_til.setErrorEnabled(false);
        }

        if(isUsernameValid && isPasswordValid) {
            String username = Username_et.getText().toString();
            String password = Password_et.getText().toString();
            String type = "login";
            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, username, password);
        }
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
