package com.gallery.book;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class NumberActivity extends AppCompatActivity {

    EditText num_text;
    Button otp_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }


        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        FirebaseUser user = firebaseAuth.getCurrentUser();

        if (user != null) {
            finish();
            startActivity(new Intent(NumberActivity.this, MainActivity.class));
        }




        ProgressBar progressBar = findViewById(R.id.p_bar);
        num_text=findViewById(R.id.num_text);
        otp_btn=findViewById(R.id.otp_btn);
        otp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num_text.getText().toString().trim().isEmpty()){
                    if((num_text.getText().toString().trim()).length()==10){

                        progressBar.setVisibility(View.VISIBLE);
                        otp_btn.setVisibility(View.INVISIBLE);

                        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                                "+91" + num_text.getText().toString(),
                                60,
                                TimeUnit.SECONDS,
                                NumberActivity.this,
                                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                    @Override
                                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

                                        progressBar.setVisibility(View.GONE);
                                        otp_btn.setVisibility(View.VISIBLE);
                                    }

                                    @Override
                                    public void onVerificationFailed(@NonNull FirebaseException e) {

                                        progressBar.setVisibility(View.GONE);
                                        otp_btn.setVisibility(View.VISIBLE);
                                        Toast.makeText(NumberActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                                    }

                                    @Override
                                    public void onCodeSent(@NonNull String backendotp, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                        progressBar.setVisibility(View.GONE);
                                        otp_btn.setVisibility(View.VISIBLE);
                                        Intent intent = new Intent(getApplicationContext(),OtpActivity.class);
                                        intent.putExtra("mobile",num_text.getText().toString());
                                        intent.putExtra("backendotp",backendotp);
                                        startActivity(intent);
                                    }
                                }

                        );


                    }else {
                        Toast.makeText(NumberActivity.this,"PLease enter correct number",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(NumberActivity.this,"Enter Mobile number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}