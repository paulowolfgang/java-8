package br.dev.paulowolfgang.java_8.lambdas_and_streams;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Paulo Silva
 */
public class RandomIntStream
{
    public static void main(String[] args)
    {
        SecureRandom random = new SecureRandom();
        
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(6_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((face, frequency) ->
                        System.out.printf("%-6d%d%n", face, frequency));
    }
}
