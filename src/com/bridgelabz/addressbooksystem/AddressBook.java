package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner scr = new Scanner(System.in);

    void addContact() {
        System.out.println("Enter firstName");
        contact.setFirstName(scr.next());
        System.out.println("Enter lastName");
        contact.setLastName(scr.next());
        System.out.println("Enter city");
        contact.setCity(scr.next());
        System.out.println("Enter state");
        contact.setState(scr.next());
        System.out.println("Enter email");
        contact.setEmail(scr.next());
        System.out.println("Enter zip");
        contact.setZip(scr.nextInt());
        System.out.println("Enter phoneNumber");
        contact.setPhoneNumber(scr.nextLong());
    }


    void editContact() {
        System.out.println("Enter first name of person to edit");
        String firstName = scr.next();
        if (firstName.equals(contact.getFirstName())) {
            System.out.println("Enter the details of person");
            System.out.println("Enter first name");
            contact.setFirstName(scr.next());

            System.out.println("Enter lastName");
            contact.setLastName(scr.next());

            System.out.println("Enter city");
            contact.setCity(scr.next());

            System.out.println("Enter state");
            contact.setState(scr.next());

            System.out.println("Enter email");
            contact.setEmail(scr.next());

            System.out.println("Enter zip");
            contact.setZip(scr.nextInt());

            System.out.println("Enter phoneNumber");
            contact.setPhoneNumber(scr.nextLong());
        } else {
            System.out.println("person not found");
        }

    }

    void deleteContact() {
        System.out.println("Enter the first name person to delete ");
        String firstNmae = scr.next();

        if (firstNmae.equals(contact.getFirstName())) {
            contact = null;
        } else {
            System.out.println("no contact found");
        }
    }

    Contacts display() {
        return contact;
    }

}
