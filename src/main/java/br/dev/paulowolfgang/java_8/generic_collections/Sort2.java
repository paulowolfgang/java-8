package br.dev.paulowolfgang.java_8.generic_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class Sort2
{
    public static void main(String[] args)
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);
        
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s%n", list);
    }
}
