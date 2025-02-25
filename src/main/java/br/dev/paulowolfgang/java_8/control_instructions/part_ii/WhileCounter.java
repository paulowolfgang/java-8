
package br.dev.paulowolfgang.java_8.control_instructions.part_ii;

/**
 *
 * @author Paulo Silva
 */
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1;
        
        while(counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }
        
        System.out.println();
    }
}
