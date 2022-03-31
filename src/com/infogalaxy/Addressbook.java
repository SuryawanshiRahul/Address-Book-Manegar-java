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
    public void editContact(){
        System.out.println("Enter The FirstName");
        String fName =sc.next();
        int i;
        int flaq = 0;
        for ( i = 0;i <contactlist.size();i++){
          Contact contact = contactlist.get(i);
          if (fName.equals(contact.getFirstName())){
              flaq = 1;
              break;
          }
        }
        if (flaq == 0){
            System.out.println("Contact is not found");
        }else {
            Contact contact = contactlist.get(i);
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
    }
    public void findState(){
        System.out.println("Enter the State :");
        String stateName = sc.next();
        for (int i= 0;i< contactlist.size();i++){
            Contact contact =contactlist.get(i);
            if (stateName.equals(contact.getState())){
                System.out.println(contact.getFirstName());
                System.out.println(contact.getLastName());
                System.out.println(contact.getMobno());
            }
        }
    }
    public void deleteContact(){
        System.out.println("Enter Contact First Name :");
        String delete =sc.next();
       for (int i = 0; i < contactlist.size();i++){
           Contact contact =contactlist.get(i);
           if (delete.equals(contact.getFirstName())){
               contactlist.remove(i);

           }
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
                System.out.println("\n1.Add Contact\n2.Display Contact\n3.Edit Contact\n4.Find State\n5.Delete Contact\n6.exit");
                System.out.println("Enter Your Choice : ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        addressbook.addContact();
                        break;
                    case 2:
                        addressbook.dispayContact();
                        break;
                    case 3:
                        addressbook.editContact();
                        break;
                    case 4:
                        addressbook.findState();
                        break;
                    case 5:
                        addressbook.deleteContact();
                }
            }while (choice !=6);

    }
}
