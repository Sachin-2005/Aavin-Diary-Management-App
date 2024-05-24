package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InputPage extends AppCompatActivity {

    EditText editText_societyRegNo, editText_societyName, editText_district, editText_taluk, editText_block;
    EditText editText_villagePanchayat, editText_revenueVillage, editText_date;

    EditText editText_totalProcurementMorning, editText_localSalesMorning, editText_sentToUnionMorning;

    EditText editText_noOfMembersMorning, editText_noOfNonMembersMorning, editText_newMembersMorning;

    EditText editText_totalProcurementEvening, editText_localSalesEvening, editText_sentToUnionEvening;

    EditText editText_noOfMembersEvening, editText_noOfNonMembersEvening, editText_newMembersEvening;

    public Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_page);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText_societyRegNo = findViewById(R.id.editText_societyRegNo);
        editText_societyName = findViewById(R.id.editText_societyName);
        editText_district = findViewById(R.id.editText_district);
        editText_taluk = findViewById(R.id.editText_taluk);
        editText_block = findViewById(R.id.editText_block);
        editText_villagePanchayat = findViewById(R.id.editText_villagePanchayat);
        editText_revenueVillage = findViewById(R.id.editText_revenueVillage);
        editText_date = findViewById(R.id.editText_date);

        editText_totalProcurementMorning = findViewById(R.id.editText_totalProcurementMorning);
        editText_localSalesMorning = findViewById(R.id.editText_localSalesMorning);
        editText_sentToUnionMorning = findViewById(R.id.editText_sentToUnionMorning);

        editText_noOfMembersMorning = findViewById(R.id.editText_noOfMembersMorning);
        editText_noOfNonMembersMorning = findViewById(R.id.editText_noOfNonMembersMorning);
        editText_newMembersMorning = findViewById(R.id.editText_newMembersMorning);

        editText_totalProcurementEvening = findViewById(R.id.editText_totalProcurementEvening);
        editText_localSalesEvening = findViewById(R.id.editText_localSalesEvening);
        editText_sentToUnionEvening = findViewById(R.id.editText_sentToUnionEvening);

        editText_noOfMembersEvening = findViewById(R.id.editText_noOfMembersEvening);
        editText_noOfNonMembersEvening = findViewById(R.id.editText_noOfNonMembersEvening);
        editText_newMembersEvening = findViewById(R.id.editText_newMembersEvening);


        submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String societyRegNo = editText_societyRegNo.getText().toString();
                String societyName = editText_societyName.getText().toString();
                String district = editText_district.getText().toString();
                String taluk = editText_taluk.getText().toString();
                String block = editText_block.getText().toString();
                String villagePanchayat = editText_villagePanchayat.getText().toString();
                String revenueVillage = editText_revenueVillage.getText().toString();
                String date = editText_date.getText().toString();

                String totalProcurementMorning = editText_totalProcurementMorning.getText().toString();
                String localSalesMorning = editText_localSalesMorning.getText().toString();
                String sentToUnionMorning = editText_sentToUnionMorning.getText().toString();

                String noOfMembersMorning = editText_noOfMembersMorning.getText().toString();
                String noOfNonMembersMorning = editText_noOfNonMembersMorning.getText().toString();
                String newMembersMorning = editText_newMembersMorning.getText().toString();

                String totalProcurementEvening = editText_totalProcurementEvening.getText().toString();
                String localSalesEvening = editText_localSalesEvening.getText().toString();
                String sentToUnionEvening = editText_sentToUnionEvening.getText().toString();


                String noOfMembersEvening = editText_noOfMembersEvening.getText().toString();
                String noOfNonMembersEvening = editText_noOfNonMembersEvening.getText().toString();
                String newMembersEvening = editText_newMembersEvening.getText().toString();

                Model model = new Model(societyRegNo, societyName, district, taluk, block, villagePanchayat, revenueVillage, date, totalProcurementMorning, localSalesMorning, sentToUnionMorning, noOfMembersMorning, noOfNonMembersMorning, newMembersMorning, totalProcurementEvening, localSalesEvening, sentToUnionEvening, noOfMembersEvening, noOfNonMembersEvening, newMembersEvening);

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference ref = db.getReference("Input");
                ref.child(societyRegNo).setValue(model);
                Toast.makeText(InputPage.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(InputPage.this, Admin.class);
                startActivity(intent);

            }
        });

    }
}