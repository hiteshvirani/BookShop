package com.gallery.book;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class OrderActivity extends AppCompatActivity {

    Button bb;

    private EditText NameEdt, PhoneEdt, AddressEdt;


    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    EmployeeInfo employeeInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }


        NameEdt = findViewById(R.id.name_box);
        PhoneEdt = findViewById(R.id.num_box);
        AddressEdt = findViewById(R.id.address_box);


        firebaseDatabase = FirebaseDatabase.getInstance();

        databaseReference = firebaseDatabase.getReference("EmployeeInfo");
        employeeInfo = new EmployeeInfo();



        bb=findViewById(R.id.button655);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                String name = NameEdt.getText().toString();
                String phone = PhoneEdt.getText().toString();
                String address = AddressEdt.getText().toString();


                if (TextUtils.isEmpty(name) && TextUtils.isEmpty(phone) && TextUtils.isEmpty(address)) {

                    Toast.makeText(OrderActivity.this, "Please add some data.", Toast.LENGTH_SHORT).show();
                } else {

                    addDatatoFirebase(name, phone, address);
                    Intent i = new Intent(OrderActivity.this, CompleteActivity.class);
                    startActivity(i);
                }






            }
        });
    }

    private void addDatatoFirebase(String name, String phone, String address) {

        employeeInfo.setUserName(name);
        employeeInfo.setUserContactNumber(phone);
        employeeInfo.setUserAddress(address);


        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                databaseReference.setValue(employeeInfo);


//                Toast.makeText(OrderActivity.this, "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

//                Toast.makeText(OrderActivity.this, "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}