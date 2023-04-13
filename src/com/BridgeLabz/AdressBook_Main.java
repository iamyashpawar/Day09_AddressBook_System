package com.BridgeLabz;

import java.util.Scanner;

public class AdressBook_Main extends Contact_person
{
    public static void main(String[] args)
    {
    AdressBook_Main person1 = new AdressBook_Main();

        System.out.println("Welcome To Adressbook System");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter First Name: ");
       person1.Fname = sc.next();

        System.out.print("Enter Last Name: ");
         person1.Lname = sc.next();

        System.out.print("Enter Your Address: ");
        person1.Address =sc.next();

        System.out.print("Enter Your City: " );
        person1.CityName =sc.next();

        System.out.print("Enter Your State: ");
        person1.StateName =sc.next();

        System.out.print("Enter Your Zip Code: ");
        person1.ZipCode= sc.nextInt();

        System.out.print("Enter Your Mobile Number: ");
        person1.PhoneNumber=sc.next();

        System.out.print("Enter Email Address: ");
        person1.email = sc.next();



    }

}
