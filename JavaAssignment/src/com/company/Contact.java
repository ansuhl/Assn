package com.company;

import com.company.Details1Compulsary;
import com.company.EmailFormat;
import com.company.NumberNotProvided;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String Anniversary;
    private String Adress;
    private String Area;
    private String City;
    private String pinCode;
    private String country;
    private String TelePhone;
    private String email;
    private String website;
    private String mobileNo;

    public Contact(String mobuleNo,String firstName, String middleName, String lastName, String dateOfBirth, String gender, String anniversary, String adress, String area, String city, String pinCode, String country, String telePhone, String email, String website) {
        this.mobileNo=mobuleNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        Anniversary = anniversary;
        Adress = adress;
        Area = area;
        City = city;
        this.pinCode = pinCode;
        this.country = country;
        TelePhone = telePhone;
        this.email = email;
        this.website = website;
    }
    public boolean validate(){
        boolean validation=true;
        try{
            if(this.firstName==null
                    &&this.lastName==null
                    &&this.dateOfBirth==null
                    &&this.email==null){
                throw new Details1Compulsary("firstName,lastName,dateOfBirth,email are compulsary");
            }else{
                System.out.println("Details 1 are correct");
            }
        }catch (Exception e){
            validation=false;
            e.printStackTrace();
        }
        try{
            if(this.email.contains("@gmail.com")==false){
                throw new EmailFormat("Email format is not correct");
            }else{
                System.out.println("Email format is correct");
            }
        }catch (Exception e){
            validation=false;
            e.printStackTrace();
        }
        try {

            if(this.TelePhone==null&&this.mobileNo==null){
                throw new NumberNotProvided("No contact Provided");
            }else{
                System.out.println("contact provided");
            }
        }catch (Exception e){
            validation=false;
            e.printStackTrace();
        }
        System.out.println("Format Completed");
        return validation;
    }
}
