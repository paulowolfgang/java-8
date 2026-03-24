package br.dev.paulowolfgang.java_8.threads;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author Paulo Silva
 */
public class PrimeCalculator extends SwingWorker<Integer, Integer>
{
    private static final SecureRandom generator = new SecureRandom();
    private final JTextArea intermediateJTextArea;
    private final JButton getPrimesJButton;
    private final JButton cancelJButton;
    private final JLabel statusJLabel;
    private final boolean[] primes;
    
    // Construtor
    public PrimeCalculator(int max, JTextArea intermediateJTextArea,
        JLabel statusJLabel, JButton getPrimesJButton,
        JButton cancelJButton)
    {
        this.intermediateJTextArea = intermediateJTextArea;
        this.statusJLabel = statusJLabel;
        this.getPrimesJButton = getPrimesJButton;
        this.cancelJButton = cancelJButton;
        
        primes = new boolean[max];

        Arrays.fill(primes, true);
    }
    
    public Integer doInBackground()
    {
        int count = 0;

        /*Começando no terceiro valor, circula pelo array e coloca
            falso como o valor de qualquer número maior que for um múltiplo */
        for (int i = 2; i < primes.length; i++)
        {
            if (isCancelled()) // Se o cálculo foi cancelado
                return count;
            else
            {
            
                setProgress(100 * (i + 1) / primes.length);

                try
                {
                    Thread.sleep(generator.nextInt(5));
                }
                catch (InterruptedException ex)
                {
                    statusJLabel.setText("Worker thread interrupted");

                    return count;
                }

                if (primes[i])
                {
                    publish(i);
                    ++count;

                    for (int j = i + i; j < primes.length; j += i)
                        primes[j] = false;
                }
            }
        }
        
        return count;
    }
    
    // Exibe os valores publicados na lista de números primos
    protected void process(List<Integer> publishedVals)
    {
        for (int i = 0; i < publishedVals.size(); i++)
            intermediateJTextArea.append(publishedVals.get(i) + "\n");
    }

    // Código para executar quando doInBackground completa
    protected void done()
    {
        getPrimesJButton.setEnabled(true);
        cancelJButton.setEnabled(false);

        try
        {
            // Recupera e exibe o valor de retorno doInBackground
            statusJLabel.setText("Found " + get() + " primes.");
        }
        catch (InterruptedException | ExecutionException | CancellationException ex)
        {
            statusJLabel.setText(ex.getMessage());
        }
    }
}
