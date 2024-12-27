package br.dev.paulowolfgang.java_8.io_operators;

/**
 *
 * @author Paulo Silva
 */
public class Welcome1 {
    /*
    Exemplo de comentário tradicional.
    Pode conter múltiplas linhas!
    */
    
    // Programa de impressão de texto
    public static void main(String[] args) {
        System.out.print("Welcome to ");
        System.out.println("Java programming!");
        
        /*
            \n -> Nova linha
            \t -> Tabulação horizontal
            \r -> Retorno de carro
            \\ -> Barras invertidas
            \" -> Aspas duplas
        */
        
        // Imprimindo dados formatados
        System.out.printf("%s%n%s%n", "Welcome to", "Java programming!");
    }
}
