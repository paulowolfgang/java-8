package br.dev.paulowolfgang.java_8.classes_and_objects.package_data;

/**
 *
 * @author pvsil
 */
public class PackageDataTest {
    public static void main(String[] args) {
        
        PackageData packageData = new PackageData();
        
        System.out.printf("After instantiation:%n%s%n", packageData);
        
        packageData.number = 77;
        packageData.string = "Goodbye";
        
        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
}

/*

// Outra opção seria ussar a classe 'PackageData' no mesmo arquivo fonte

class PackageData {
    
    int number;
    String string;
    
    public PackageData()
    {
        number = 0;
        string = "Hello";
    }
    
    public String toString()
    {
        return String.format("number: %d; string: %s", number, string);
    }
}
*/