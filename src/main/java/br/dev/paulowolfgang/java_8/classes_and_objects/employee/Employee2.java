package br.dev.paulowolfgang.java_8.classes_and_objects.employee;

/**
 *
 * @author Paulo SIlva
 */
public class Employee2 {
    
    private static int count = 0;
    private String firstName;
    private String lastName;
    
    public Employee2(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        
        ++count;
        
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public static int getCount()
    {
        return count;
    }
}
