package com.priyanshnama.jagrati;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity implements TextWatcher {
    private View layout_login, layout_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        layout_login = findViewById(R.id.layout_login);
        layout_signup = findViewById(R.id.layout_signup);
        go_to_login(null);
    }

    private String getEmail() {
        return getEmailEdit().getText().toString();
    }

    private EditText getEmailEdit() {
        TextInputLayout txt_email = findViewById(R.id.txt_email);
        return txt_email.getEditText();
    }

    private String getPassword() {
        return getPasswordEdit().getText().toString();
    }

    private EditText getPasswordEdit() {
        TextInputLayout txt_password = findViewById(R.id.txt_password);
        return txt_password.getEditText();
    }

    private String getConfirmPassword(){return getConfirmPasswordEdit().getText().toString();}

    private EditText getConfirmPasswordEdit() {
        TextInputLayout txt_confirmPassword = findViewById(R.id.txt_confirm_password);
        return txt_confirmPassword.getEditText();
    }

    private View getViewAnimator(){
        return findViewById(R.id.animator_message);
    }

    @Override
    public void afterTextChanged(Editable text) {
    }

    @Override
    public void beforeTextChanged(CharSequence text, int start, int count, int before) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    private void startAuthentication(){
        String email = getEmail();
        String password = getPassword();
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }

    private void showProfile() {
        startActivity(new Intent(this,ProfileActivity.class));
        finish();
    }

    public void go_to_signup(View view) {
        layout_login.setVisibility(View.INVISIBLE);
        layout_signup.setVisibility(View.VISIBLE);
    }

    public void login(View view) {
        if (getEmail().trim().isEmpty() || getPassword().trim().isEmpty()) {

            if (getEmail().trim().isEmpty())
                getEmailEdit().requestFocus();

            if (getPassword().trim().isEmpty())
                getPasswordEdit().requestFocus();

            if (getEmail().trim().isEmpty() && getPassword().trim().isEmpty())
                getEmailEdit().requestFocus();

        } else {
            startAuthentication();
        }
    }

    public void signup(View view){
        if (getEmail().trim().isEmpty() || getPassword().trim().isEmpty() || getConfirmPassword().trim().isEmpty()) {

            if (getEmail().trim().isEmpty())
                getEmailEdit().requestFocus();

            if (getPassword().trim().isEmpty())
                getPasswordEdit().requestFocus();

            if(getConfirmPassword().trim().isEmpty())
                getConfirmPasswordEdit().requestFocus();

            if (getEmail().trim().isEmpty() && getPassword().trim().isEmpty())
                getEmailEdit().requestFocus();

        } else if(!checkEmail(getEmail())){

            Toast.makeText(LoginActivity.this,R.string.message_error_invalid_email, Toast.LENGTH_SHORT).show();

        } else if(!checkPasswordForNumber(getPassword())){

            Toast.makeText(LoginActivity.this,R.string.message_error_no_number_in_password,Toast.LENGTH_LONG).show();

        }else if(!checkPasswordForLength(getPassword())){

            Toast.makeText(LoginActivity.this,R.string.message_error_small_password,Toast.LENGTH_LONG).show();

        }else if(!getPassword().equals(getConfirmPassword())){

            Toast.makeText(LoginActivity.this,R.string.message_error_password_do_not_match,Toast.LENGTH_LONG).show();

        } else {
            startSignup();
        }

    }

    private boolean checkPasswordForLength(String password) {
        return password.length() >= 8;
    }

    private boolean checkPasswordForNumber(String password){
        final String PASS_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z])$";
        final Pattern PASS_PATTERN = Pattern.compile(PASS_REGEX);
        if (password == null) {
            return false;
        }

        Matcher matcher = PASS_PATTERN.matcher(password);
        return matcher.matches();
    }

    private boolean checkEmail(String email) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        if (email == null) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    private void startSignup() {

    }

    public void go_to_login(View view) {
        layout_login.setVisibility(View.VISIBLE);
        layout_signup.setVisibility(View.INVISIBLE);
    }
}