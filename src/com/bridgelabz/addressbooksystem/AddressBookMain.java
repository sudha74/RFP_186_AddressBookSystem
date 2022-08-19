package com.bridgelabz.addressbooksystem;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe program");
        Contacts contact = new Contacts();
        contact.setFirstName("Sudha");
        System.out.println(contact.getFirstName());
    }
}
