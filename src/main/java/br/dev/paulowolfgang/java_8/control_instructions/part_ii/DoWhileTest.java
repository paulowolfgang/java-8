package br.dev.paulowolfgang.java_8.control_instructions.part_ii;

/**
 *
 * @author Paulo Silva
 */
public class DoWhileTest {
    public static void main(String[] args) {
        
        int counter = 1;
        
        do{
            System.out.printf("%d ", counter);
            ++counter;
        }while(counter <= 10);
        
        System.out.println();
    }
}
