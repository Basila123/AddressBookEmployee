package com.bridgelabzAddress;
import java.util.Scanner;

public class AddressBook {
    public static void main (String[] args){
        System.out.println("enter Employees first name");
        Scanner s= new Scanner(System.in);
        String firstName=s.nextLine();
        System.out.println("enter Employees second name");
        String secondName=s.nextLine();
        System.out.println("enter Employees Address");
        String address=s.nextLine();
        System.out.println("City");
        String city=s.nextLine();
        System.out.println("enter State");
        String state=s.nextLine();
        System.out.println("zip code");
        String zip=s.nextLine();
        System.out.println("enter Employees email");
        String email=s.nextLine();
        System.out.println("enter Employees phone number");
        Scanner s1= new Scanner(System.in);
        int phno=s.nextInt();
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(address);
        System.out.println(city);
        System.out.println(zip);
        System.out.println(email);
        System.out.println(phno);
    }
}
