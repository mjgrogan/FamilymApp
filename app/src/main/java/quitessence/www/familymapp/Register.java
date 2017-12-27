package quitessence.www.familymapp;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private TextInputLayout Username_til, FamilyName_til, Password_til, PasswordConfirm_til, Mobile_til;
    private EditText Username_et, FamilyName_et, Password_et, PasswordConfirm_et, Mobile_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initializeWidgets();
    }

    private void initializeWidgets() {
        Username_til = (TextInputLayout) findViewById(R.id.tilUsername);
        Username_et = (EditText) findViewById(R.id.etUsername);
        FamilyName_til = (TextInputLayout) findViewById(R.id.tilFamilyName);
        FamilyName_et = (EditText) findViewById(R.id.etFamilyName);
        Password_til = (TextInputLayout) findViewById(R.id.tilPassword);
        Password_et = (EditText) findViewById(R.id.etPassword);
        PasswordConfirm_til = (TextInputLayout) findViewById(R.id.tilConfirmPassword);
        PasswordConfirm_et = (EditText) findViewById(R.id.etConfirmPassword);
        Mobile_til = (TextInputLayout) findViewById(R.id.tilMobile);
        Mobile_et = (EditText) findViewById(R.id.etMobile);
    }

    /** Called when the user taps the "Register" button */
    public void Register_mthd(View view) {

        /** Used to confirm Registration_met call / Registration information validation code
        Toast toastvalidation = Toast.makeText(getApplicationContext(), "Test Registration information validation code", Toast.LENGTH_SHORT);
        toastvalidation.show();
        */

        boolean isUsernameValid = true;
        if(Username_et.getText().toString().trim().length() < 6) {
            Username_til.setError("Username is too short (must be a minimum of 6 characters). Please try again...");
            isUsernameValid = false;
        } else {
            Username_til.setErrorEnabled(false);
        }

        boolean isFamilyNameValid = true;
        if(FamilyName_et.getText().toString().trim().length() < 6) {
            FamilyName_til.setError("Family Name is too short (must be a minimum of 6 characters). Please try again...");
            isFamilyNameValid = false;
        } else {
            FamilyName_til.setErrorEnabled(false);
        }

        boolean isPasswordValid = true;
        if(Password_et.getText().toString().trim().length() < 6) {
            Password_til.setError("Password is too short (must be a minimum of 6 characters). Please try again...");
            isPasswordValid = false;
        } else {
            Password_til.setErrorEnabled(false);
        }

        boolean isPasswordConfirmValid = true;
        String passwordfirst = Password_et.getText().toString();
        String passwordconfirm = PasswordConfirm_et.getText().toString();
        if(isPasswordValid && !passwordfirst.equals(passwordconfirm)) {
            PasswordConfirm_til.setError("Password and Confirmation Password do not match. Please try again...");
            isPasswordConfirmValid = false;
        } else {
            PasswordConfirm_til.setErrorEnabled(false);
        }

        boolean isMobileValid = true;
        if(Mobile_et.getText().toString().trim().length() < 10) {
            Mobile_til.setError("Mobile is too short (must be a minimum of 10 characters). Please try again...");
            isMobileValid = false;
        } else {
            Mobile_til.setErrorEnabled(false);
        }

        if(isUsernameValid && isFamilyNameValid && isPasswordConfirmValid && isMobileValid) {

            String username = Username_et.getText().toString();
            String familyname = FamilyName_et.getText().toString();
            String password = Password_et.getText().toString();
            String mobile = Mobile_et.getText().toString();
            String type = "register";

            BackgroundWorker backgroundWorker = new BackgroundWorker(this);
            backgroundWorker.execute(type, username, familyname, password, mobile);
        }

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
