package com.bridgelabz;

public class AdressBookMain
{
    public static void main(String[] args)
    {
        int selectOption =2;
        AddressBook addressBook1 = new AddressBook();



        switch (selectOption)
        {
            case 1:
                System.out.println("You Select Add Contact Option ");
                addressBook1.addContact();
                break;

            case 2 :
                    System.out.println("You Select to edit Contact");
                addressBook1.editContact();
                 break;
            default :
                System.out.println("You Select exit");

        }

        System.out.println(addressBook1);



    }

}
