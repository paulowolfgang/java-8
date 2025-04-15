package br.dev.paulowolfgang.java_8.generic_collections;

import br.dev.paulowolfgang.java_8.case_study.time.Time;
import java.util.Comparator;

/**
 *
 * @author Paulo Silva
 */
public class TimeComparator implements Comparator<Time>
{
    @Override
    public int compare(Time time1, Time time2)
    {
        int hourDifference = time1.getHour() - time2.getHour();
        
        if (hourDifference != 0)
            return hourDifference;

        int minuteDifference = time1.getMinute() - time2.getMinute();
        
        if (minuteDifference != 0)
            return minuteDifference;

        int secondDifference = time1.getSecond() - time2.getSecond();
            return secondDifference;
    }
}
