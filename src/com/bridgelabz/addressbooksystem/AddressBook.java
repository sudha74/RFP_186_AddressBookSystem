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

    Contacts display() {
        return contact;
    }
}
