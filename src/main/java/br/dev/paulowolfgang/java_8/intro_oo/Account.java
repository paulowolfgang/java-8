package br.dev.paulowolfgang.java_8.intro_oo;

/**
 *
 * @author Paulo Silva
 */
public class Account {
    
    private String name;
    
    public Account(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
