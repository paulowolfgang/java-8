package br.dev.paulowolfgang.java_8.classes_and_objects.package_data;

/**
 *
 * @author Paulo Silva
 */
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
