package br.dev.paulowolfgang.java_8.generic_collections;

import br.dev.paulowolfgang.java_8.case_study.time.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class Sort3
{
    public static void main(String[] args)
    {
        List<Time> list = new ArrayList<>();
        
        list.add(new Time(6, 24, 34));
        list.add(new Time(18, 14, 58));
        list.add(new Time(6, 05, 34));
        list.add(new Time(12, 14, 58));
        list.add(new Time(6, 24, 22));
    
        System.out.printf("Unsorted array elements:%n%s%n", list);
        
        Collections.sort(list, new TimeComparator());
        
        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
