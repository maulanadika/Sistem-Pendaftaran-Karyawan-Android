package com.example.ptsuksesapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.ptsuksesapp.PreferenceHelper;
import com.example.ptsuksesapp.R;

public class EditProfileActivity extends AppCompatActivity {

    private ImageView ic_back;
    private EditText nik, nama, username, jeniskelamin, email, alamat, date, nohp, pendidikan, password;

    private PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        preferenceHelper = new PreferenceHelper(this);

        nik = findViewById(R.id.nik);
        nama = findViewById(R.id.nama);
        username = findViewById(R.id.username);
        jeniskelamin = findViewById(R.id.jeniskelamin);
        email = findViewById(R.id.email);
        alamat = findViewById(R.id.alamat);
        nohp = findViewById(R.id.nohp);
        pendidikan = findViewById(R.id.pendidikan);
        password = findViewById(R.id.password);
        date = findViewById(R.id.date);

        nik.setFocusable(false);
        nik.setClickable(false);
        username.setFocusable(false);
        username.setClickable(false);
        jeniskelamin.setFocusable(false);
        jeniskelamin.setClickable(false);
        date.setFocusable(false);
        date.setClickable(false);

        nik.setText(preferenceHelper.getNIK());
        nama.setText(preferenceHelper.getNAMA());
        username.setText(preferenceHelper.getUSERNAME());
        jeniskelamin.setText(preferenceHelper.getJENISKELAMIN());
        email.setText(preferenceHelper.getEMAIL());
        alamat.setText(preferenceHelper.getALAMAT());
        nohp.setText(preferenceHelper.getNOHP());
        pendidikan.setText(preferenceHelper.getPENDIDIKAN());
        password.setText(preferenceHelper.getPASSWORD());


        ic_back = findViewById(R.id.ic_back);
        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
