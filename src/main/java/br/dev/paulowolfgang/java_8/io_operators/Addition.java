package br.dev.paulowolfgang.java_8.io_operators;

import java.util.Scanner;

/**
 *
 * @author Paulo Silva
 */
public class Addition {
    public static void main(String[] args) {
        /*
        Tipos primitivos
        
        boolean
        byte
        char
        short
        int
        float
        double
        */
        
        // Cria um objeto Scanner para obter a entrada a partir de uma janela de comando
        Scanner input = new Scanner(System.in);
        
        int number01;
        int number02;
        int sum;
        
        System.out.println("Enter first integer: ");
        number01 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        number02 = input.nextInt();
        
        sum = number01 + number02;
        
        System.out.printf("Sum is: %d%n", sum);
    }
}
