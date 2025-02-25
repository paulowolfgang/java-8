package br.dev.paulowolfgang.java_8.control_instructions.part_ii;

/**
 *
 * @author Paulo Silva
 */
public class Sum {
    public static void main(String[] args) {
        
        int total = 0;
        
        for (int number = 2; number <= 20; number += 2) {
            total += number;
        }
        
        System.out.printf("Sum is: %d%n", total);
    }
}
