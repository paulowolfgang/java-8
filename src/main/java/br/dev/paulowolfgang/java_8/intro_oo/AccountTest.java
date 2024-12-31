package br.dev.paulowolfgang.java_8.intro_oo;

import java.util.Scanner;

/**
 *
 * @author Paulo Silva
 */
public class AccountTest {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        
        Account myAccount = new Account();
        
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        System.out.println("Please, enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
        */
        
        Account account01 = new Account("Jane Green");
        Account account02 = new Account("Jane Blue");
        
        System.out.printf("Account 01 name is: %s%n", account01.getName());
        System.out.printf("Account 02 name is: %s%n", account02.getName());
    }
}
