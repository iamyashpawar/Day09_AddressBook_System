package com.bridgelabz;

import java.util.Scanner;

public class AdressBookMain
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Option 1 for add contact & 2 for edit contact");

        int selectOption =sc.nextInt();

        AddressBook addressBook1 = new AddressBook();


        switch (selectOption) {

            case 1 -> {
                System.out.println("You Select Add Contact Option ");
                addressBook1.addContact();
            }
            case 2 -> {
                System.out.println("Yo to edit Contact");
                addressBook1.editContact();
                System.out.println("Enter Your Options:");
                System.out.println("First Name");
                System.out.println("Last Name");
                System.out.println("Address");
                System.out.println("City");
                System.out.println("State");
                System.out.println("Zip");
                System.out.println("7.Phone Number");
                System.out.println("email Id");
                int temp = sc.nextInt();
            }
            default -> System.out.println("You Select exit");
        }

        System.out.println(addressBook1);



    }

}
