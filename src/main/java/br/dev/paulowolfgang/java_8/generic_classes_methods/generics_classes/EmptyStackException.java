package br.dev.paulowolfgang.java_8.generic_classes_methods.generics_classes;

/**
 *
 * @author Paulo Silva
 */
public class EmptyStackException extends RuntimeException
{
    public EmptyStackException()
    {
        this("Stack is empty");
    }
    
    public EmptyStackException(String message)
    {
        super(message);
    }
}
