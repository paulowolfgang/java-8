package br.dev.paulowolfgang.java_8.methods;

/**
 *
 * @author Paulo Silva
 */
public class Scope {
    
    private static int x = 1;
    
    public static void main(String[] args) {
        
        int x = 5;
        
        System.out.printf("Local X in main is %d%n", x);
        
        useLocalVariable();
        useField();
        useLocalVariable();
        useField();
        
        System.out.printf("Local X in main is %d%n", x);
    }
    
    public static void useLocalVariable(){
        int x = 25;
        
        System.out.printf("%nLocal X on entering method useLocalVariable is %d%n", x);
        
        x++;
        
        System.out.printf("Local X before exiting method useLocalVariable is %d%n", x);
    }
    
    public static void useField(){
        System.out.printf("%nField XS on entering method useField is %d%n", x);
        
        x *= 10;
        
        System.out.printf("Field X before exiting method useField is %d%n", x);
    }
}
