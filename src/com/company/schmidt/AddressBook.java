package com.company.schmidt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("please give your name");
        String name = sc.next();
        System.out.println("Please give your email");
        String email = sc.next();
        person person1 = new person ((name), (email));
        System.out.println(person1);




        HashMap<String, String> nameEmail = new HashMap<String, String>();
        nameEmail.put("Gunnar", "Gunnarkam621@gmail.com");
        nameEmail.put("Mr.K","mrkIsSoCool.com");
        nameEmail.put("Joyce Farel","JoiceFarelIsGod.com");

        System.out.println("enter a new name to go into the database");
        String newName = sc.next();
        System.out.println("please enter a new email to go into the database");
        String newEmail = sc.next();
        nameEmail.put(newName,newEmail);

        System.out.println("Please enter the name of the person you would like to look up from the list below");
        String names[] = {"Gunnar", "Mr.K", "Joyce Farel" +", "+ newName };
        System.out.println(Arrays.toString(names));

        String emails = sc.next();

        System.out.println(emails + "'s email address is "+ nameEmail.get(emails));

    }
}
