package com.infogalaxy;

import java.util.Scanner;

public class Addressbook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    public void addContact(){
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
    }
    public  void dispayContact(){
        System.out.println(contact.toString());
    }

    public static void main(String[] args) {
        int list_of_contact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list Of Contact : ");
        list_of_contact = sc.nextInt();
        Addressbook[] addressbook = new Addressbook[list_of_contact];
        // UC-2 Multiple Contacts Using Array And For Loop
        for(int i = 0; i < list_of_contact; i++) {
            addressbook[i] = new Addressbook();
            addressbook[i].addContact();
        }
        for (int i = 0; i < list_of_contact; i++){
            addressbook[i].dispayContact();
        }
    }
}
