package br.dev.paulowolfgang.java_8.io_operators;

import java.util.Scanner;

/**
 *
 * @author Paulo Silva
 */
public class Comparison {
    /*
    Operadores de igualdade e relacionais
    
    == -> Igual
    != -> Diferente
    >  -> Maior que 
    <  -> Menor que
    >= -> Maior ou igual
    <= -> Menor ou igual
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number01;
        int number02;
        
        System.out.println("Enter first integer: ");
        number01 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        number02 = input.nextInt();
        
        if(number01 == number02)
            System.out.printf("%d == %d%n", number01, number02);
        
        if(number01 != number02)
            System.out.printf("%d != %d%n", number01, number02);
        
        if(number01 < number02)
            System.out.printf("%d < %d%n", number01, number02);
        
        if(number01 > number02)
            System.out.printf("%d > %d%n", number01, number02);
        
        if(number01 <= number02)
            System.out.printf("%d <= %d%n", number01, number02);
        
        if(number01 >= number02)
            System.out.printf("%d >= %d%n", number01, number02);
    }
}
