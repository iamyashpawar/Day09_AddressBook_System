package com.BridgeLabz;

import java.util.Scanner;

public class AddressBook
{
    Contact contact = new Contact();  //Association formed


    public void addContact() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name ");
        String firstName = sc.next();

        System.out.println("Enter Last Name ");
        String lastName = sc.next();

        System.out.println("Enter Address ");
        String  address =sc.next();

        System.out.println("Enter City Name ");
        String cityName = sc.next();

        System.out.println("Enter State Name ");
        String stateName = sc.next();

        System.out.println("Enter Zip Code");
        String zipCode = sc.next();

        System.out.println("Enter Phone Number ");
        String phoneNumber= sc.next();

        System.out.println("Enter Email");
        String email = sc.next();

        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCityName(cityName);
        contact.setStateName(stateName);
        contact.setZipCode(zipCode);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);

    }
}
