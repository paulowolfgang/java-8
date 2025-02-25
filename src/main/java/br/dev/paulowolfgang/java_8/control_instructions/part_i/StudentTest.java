package br.dev.paulowolfgang.java_8.control_instructions.part_i;

/**
 *
 * @author Paulo Silva
 */
public class StudentTest {
    
    public static void main(String[] args) {
        Student account01 = new Student("Jane Green", 93.5);
        Student account02 = new Student("John Blue", 72.75);
        
        System.out.printf("%s's letter grade is: %s%n",
                account01.getName(), account01.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account02.getName(), account02.getLetterGrade());
    }
}
