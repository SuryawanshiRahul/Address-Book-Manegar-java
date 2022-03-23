package com.infogalaxy;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressbook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactlist = new ArrayList<>();
    public void addContact(){
        Contact contact = new Contact();
        System.out.println("Enter The First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter The Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter The City : ");
        contact.setCity(sc.next());
        System.out.println("Enter The State  : ");
        contact.setState(sc.next());
        System.out.println("Enter The Mobile No... : ");
        contact.setMobno(sc.next());
        System.out.println("Enter The Email ID : ");
        contact.setEmail(sc.next());
        System.out.println("Enter The Zip Code : ");
        contact.setZip(sc.next());
        contactlist.add(contact);
    }
    public  void dispayContact(){
        System.out.println(contactlist.toString());
    }
 //UC-3-ContactRefactorInAddressbook
    public static void main(String[] args) {
            Addressbook addressbook = new Addressbook();
            addressbook.addContact();
            addressbook.dispayContact();
    }
}
