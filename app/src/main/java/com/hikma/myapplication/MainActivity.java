package com.hikma.myapplication;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText inNama, inPass;
    String inNama1, inPass2;
    private DatePicker datePicker;
    private Calendar calendar;
    private EditText dateView;
    private int year, month, day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateView = (EditText) findViewById(R.id.inputTglLahir);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month + 1, day);
        //for password
        getSupportActionBar().setTitle("Log in dulu braderr");
        getSupportActionBar().setSubtitle("Udin.com");

    }

    public void loginMasuk(View view) {
        //Method onClick pada Button

        inNama = (EditText) findViewById(R.id.inputNama);
        inPass = (EditText) findViewById(R.id.inputPass);
        inNama1 = inNama.getText().toString();
        inPass2 = inPass.getText().toString();


        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2

        if ((inNama.getText().toString() == "samsudin"))&&((inPass.getText().toString() == "12345"))
        {
            {
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);


        @SuppressWarnings("deprecation")
        public void setDate (View view){
            showDialog(999);
            Toast.makeText(getApplicationContext(), "ca",
                    Toast.LENGTH_SHORT)
                    .show();
        }

        @Override
        protected Dialog onCreateDialog ( int id){
            // TODO Auto-generated method stub
            if (id == 999) {
                return new DatePickerDialog(this,
                        myDateListener, year, month, day);
            }
            return null;
        }

        private DatePickerDialog.OnDateSetListener myDateListener = new
                DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker arg0,
                                          int arg1, int arg2, int arg3) {
                        // TODO Auto-generated method stub
                        // arg1 = year
                        // arg2 = month
                        // arg3 = day
                        showDate(arg1, arg2 + 1, arg3);
                    }
                };

        private void showDate ( int year, int month, int day){
            dateView.setText(new StringBuilder().append(day).append("/")
                    .append(month).append("/").append(year));
        }

        public void sendExtras (View view){
            //get data from input
            EditText nm = (EditText) findViewById(R.id.inputNama);
            String nama = nm.getText().toString();
            EditText eml = (EditText) findViewById(R.id.inputEmail);
            String email = eml.getText().toString();
            EditText tmptlahir = (EditText) findViewById(R.id.inputTmptLahir);
            String tempatlahir = tmptlahir.getText().toString();
            EditText tgllahir = (EditText) findViewById(R.id.inputTglLahir);
            String tanggallahir = tgllahir.getText().toString();
            EditText almt = (EditText) findViewById(R.id.inputAlamat);
            String alamat = almt.getText().toString();
            RadioGroup rgjk = (RadioGroup) findViewById(R.id.inputJk);
            RadioButton rbjk = (RadioButton) findViewById(rgjk.getCheckedRadioButtonId());
            String jk = rbjk.getText().toString();
            EditText pass = (EditText) findViewById(R.id.inputPass);
            String password = pass.getText().toString();
            //create object intent
            Intent intent = new Intent(this, Main2Activity.class);
            // put data
            intent.putExtra("samsudin", nama);// putExtra (key,value);
            intent.putExtra("samsudin@gmail.com", email);
            intent.putExtra("cikadut", tempatlahir);
            intent.putExtra("281298", tanggallahir);
            intent.putExtra("Bandung", alamat);
            intent.putExtra("jenisKelamin", jk);
            intent.putExtra("12345", password);
            //start Activity
            startActivity(intent);

        }
    }

}
