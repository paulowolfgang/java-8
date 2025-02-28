package br.dev.paulowolfgang.java_8.control_instructions.part_ii;

/**
 *
 * @author Paulo Silva
 */
public class BreakTest {
    public static void main(String[] args) {
        
        int count;
        
        for (count = 1; count <= 10; count++) {
            if(count == 5){
                break;
            }
            System.out.printf("%d", count);
        }
        
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
