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
        for (int i = 0;i <contactlist.size();i++){
            Contact contact =contactlist.get(i);
            System.out.println(contact.toString());

        }
    }
 //UC-3-ContactRefactorInAddressbook
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Addressbook addressbook = new Addressbook();
            int choice;
        //UC-4-Multiple Contact using Do While Loop
        do {
                System.out.println("****Contact Inventory Management****");
                System.out.println("\n1.Add Contact\n2.Display Contact\n3.Exit");
                System.out.println("Enter Your Choice : ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        addressbook.addContact();
                        break;
                    case 2:
                        addressbook.dispayContact();
                        break;
                }
            }while (choice !=3);

    }
}
