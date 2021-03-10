package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactsList= new ArrayList<Contacts>();

    public void addContact( Contacts contact){
        if (findContact(contact.getName())==-1)
            contactsList.add(contact);
        else
            System.out.println("Contact already in the list");
    }


    public void searchContact(String name){
        boolean found=false;
        for (int i=0; i<contactsList.size();i++) {
            if (contactsList.get(i).getName().equals(name) == true) {
                System.out.println("Found: " + contactsList.get(i).getName() + ": " + contactsList.get(i).getNumber());
                found=true;
                break;
            }
        }
        if (found==false)  System.out.println("Not found");
    }

    private int findContact(String name){
        for (int i=0; i<contactsList.size();i++){
            if (contactsList.get(i).getName().equals(name)==true) {
                return i;
            }
        }
        return -1;
    }

    public void removeContact(String name){
        if (findContact(name)!=-1) contactsList.remove(findContact(name));
        else System.out.println("Contact not found");
    }

    public void modifyContact(String oldName,String newName, int newNumber){
        if (findContact(oldName)!=-1){
            contactsList.set(findContact(oldName),new Contacts(newName,newNumber));
        }
        else System.out.println("Contact not found");
    }

    public void print(){
        System.out.println("There are "+contactsList.size()+" contacts");
        for (int i=0; i<contactsList.size(); i++)
            System.out.println((i+1)+". "+contactsList.get(i).getName()+": "+contactsList.get(i).getNumber());
    }
}
