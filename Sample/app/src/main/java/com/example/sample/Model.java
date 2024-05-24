package com.example.sample;

import android.widget.EditText;

public class Model {
    String Regno,Password;

    String editText_societyRegNo, editText_societyName, editText_district, editText_taluk, editText_block;
    String editText_villagePanchayat, editText_revenueVillage,editText_date;

    String editText_totalProcurementMorning,editText_localSalesMorning,editText_sentToUnionMorning;

    String editText_noOfMembersMorning,editText_noOfNonMembersMorning,editText_newMembersMorning;

    String editText_totalProcurementEvening,editText_localSalesEvening,editText_sentToUnionEvening;

    String editText_noOfMembersEvening,editText_noOfNonMembersEvening,editText_newMembersEvening;
    public Model(String regno,String password) {
        Regno=regno;
        Password=password;
    }
    public Model() {}
    public String getRegno() {
        return Regno;
    }
    public Model(String societyRegNo, String societyName, String district, String taluk, String block, String villagePanchayat, String revenueVillage,String date, String totalProcurementMorning,String localSalesMorning,String sentToUnionMorning, String noOfMembersMorning,String noOfNonMembersMorning,String newMembersMorning, String totalProcurementEvening,String localSalesEvening,String sentToUnionEvening,String noOfMembersEvening,String noOfNonMembersEvening,String newMembersEvening){
        editText_societyRegNo = societyRegNo;
        editText_societyName = societyName;
        editText_district=district;
        editText_taluk=taluk;
        editText_block=block;
        editText_villagePanchayat=villagePanchayat;
        editText_revenueVillage=revenueVillage;
        editText_date=date;
        editText_totalProcurementMorning=totalProcurementMorning;
        editText_localSalesMorning=localSalesMorning;
        editText_sentToUnionMorning=sentToUnionMorning;
        editText_noOfMembersMorning=noOfMembersMorning;
        editText_noOfNonMembersMorning=noOfNonMembersMorning;
        editText_newMembersMorning=newMembersMorning;
        editText_totalProcurementEvening=totalProcurementEvening;
        editText_localSalesEvening=localSalesEvening;
        editText_sentToUnionEvening=sentToUnionEvening;
        editText_noOfMembersEvening=noOfMembersEvening;
        editText_noOfNonMembersEvening=noOfNonMembersEvening;
        editText_newMembersEvening=newMembersEvening;
    }
    public String getPassword() {
        return Password;}
    public void setRegno(String regno) {
        Regno=regno;

    }

    public void setPassword(String password) {
        Password = password;
    }
}
