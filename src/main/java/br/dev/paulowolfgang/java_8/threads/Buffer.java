package br.dev.paulowolfgang.java_8.threads;

/**
 *
 * @author Paulo Silva
 */
public interface Buffer
{
    public void blockingPut(int value) throws InterruptedException;
    public int blockingGet() throws InterruptedException;
}
