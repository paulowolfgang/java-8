package br.dev.paulowolfgang.java_8.case_study.random_integers;

import java.security.SecureRandom;

/**
 *
 * @author Paulo Silva
 */
public class RandomIntegers {
    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();
        
        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d", face);
            
            if(counter %5 == 0)
                System.out.println();
        }
    }
}
