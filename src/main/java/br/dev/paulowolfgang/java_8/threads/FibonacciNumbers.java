package br.dev.paulowolfgang.java_8.threads;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Paulo Silva
 */
public class FibonacciNumbers extends JFrame
{
    // Componentes para calcular o número de Fibonacci inserido pelo usuário 
    private final JPanel workerJPanel = new JPanel(new GridLayout(2, 5, 5, 5));
    private final JTextField numberJTextField = new JTextField();
    private final JButton goJButton = new JButton("Go");
    private final JLabel fibonacciJLabel = new JLabel();
    
    // Componentes e variáveis para obter o próximo numero de Fibonacci
    private final JPanel eventThreadJPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    private long n1 = 0;
    private long n2 = 1;
    private int count = 1;
    private final JLabel nJLabel = new JLabel("Fibonacci of 1:  ");
    private final JLabel nFibonacciJLabel = new JLabel(String.valueOf(n2));
    private final JButton nextNumberJButton = new JButton("Next Number");
    
    public FibonacciNumbers()
    {
        super("Fibonacci Numbers");
        setLayout(new GridLayout(2, 1, 10, 10));
        
        workerJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "With SwingWorker"));
        workerJPanel.add(new JLabel("Get Fibonacci of:"));
        workerJPanel.add(numberJTextField);
        
        goJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    int n;

                    try
                    {
                        // Recupera a entrada do usuário como um inteiro
                        n = Integer.parseInt(numberJTextField.getText());
                    }
                    catch(NumberFormatException ex)
                    {
                        // Exibe uma mensagem de erro se o usuário não inseriu
                        // Um número inteiro
                        fibonacciJLabel.setText("Enter an integer.");
                        
                        return;
                    }

                    // Indica que o cálculo começou
                    fibonacciJLabel.setText("Calculating...");

                    // Cria uma tarefa para realizar o cálculo em segundo plano
                    BackgroundCalculator task = new BackgroundCalculator(n, fibonacciJLabel);
                    task.execute();
                }
            }
        );
        
        workerJPanel.add(goJButton);
        workerJPanel.add(fibonacciJLabel);
        
        // Adiciona componentes GUI ao painel da thread de despacho de eventos
        eventThreadJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK),
                "Without SwingWorker"));
        eventThreadJPanel.add(nJLabel);
        eventThreadJPanel.add(nFibonacciJLabel);
        nextNumberJButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent event)
                {
                    // Calcula o número de Fibonacci após n2
                    long temp = n1 + n2;
                    n1 = n2;
                    n2 = temp;
                    ++count;

                    // Exibe o próximo número de Fibonacci
                    nJLabel.setText("Fibonacci of " + count + ": ");
                    nFibonacciJLabel.setText(String.valueOf(n2));
                }
            }
        );
        
        eventThreadJPanel.add(nextNumberJButton);

        add(workerJPanel);
        add(eventThreadJPanel);
        setSize(275, 200);
        setVisible(true);
    }
    
    // Método main inicia a execução de programa
    public static void main(String[] args)
    {
        FibonacciNumbers application = new FibonacciNumbers();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
