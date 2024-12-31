package br.dev.paulowolfgang.java_8.intro_oo;

import java.util.Scanner;

/**
 *
 * @author Paulo Silva
 */
public class AccountTest {
    public static void main(String[] args) {
        
        Account account01 = new Account("Jane Green", 50.00);
        Account account02 = new Account("Jane Blue", -7.53);
        
        System.out.printf("%s balance: $%.2f %n", account01.getName(), account01.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account02.getName(), account02.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter deposit amount for account 01: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account 01 balance%n%n", depositAmount);
        account01.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f %n", account01.getName(), account01.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account02.getName(), account02.getBalance());
        
        System.out.print("Enter deposit amount for account 02: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account 02 balance%n%n", depositAmount);
        account02.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f %n", account01.getName(), account01.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account02.getName(), account02.getBalance());
    }
}
