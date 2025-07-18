package br.dev.paulowolfgang.java_8.generic_data_structures;

/**
 *
 * @author Paulo Silva
 */
public class EmptyListException extends RuntimeException
{
    public EmptyListException()
    {
        this("List");
    }
    
    public EmptyListException(String name)
    {
        super(name + " is empty");
    }
}
