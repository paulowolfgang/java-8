package br.dev.paulowolfgang.java_8.classes_and_objects.employee;

import br.dev.paulowolfgang.java_8.classes_and_objects.Date;

/**
 *
 * @author Paulo Silva
 */
public class EmployeeTest {
    public static void main(String[] args) {
        
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        
        System.out.println(employee);
    }
}
