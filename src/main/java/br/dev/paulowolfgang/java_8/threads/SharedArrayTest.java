package br.dev.paulowolfgang.java_8.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Paulo Silva
 */
public class SharedArrayTest
{
    public static void main(String[] args)
    {
        SimpleArray sharedSimpleArray = new SimpleArray(6);
        
        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);
    
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);
        
        executorService.shutdown();
        
        try
        {
            boolean tasksEnds = executorService.awaitTermination(1, TimeUnit.MINUTES);
            
            if (tasksEnds)
            {
                System.out.printf("%nContents of SimpleArray:%n");
                System.out.println(sharedSimpleArray);
            }
            else
            {
                System.out.println("Timed out while waiting for tasks to finish.");
            }
        }
        catch (InterruptedException exception)
        {
            exception.printStackTrace();
        }
    }
}
