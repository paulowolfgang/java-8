package br.dev.paulowolfgang.java_8.threads;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Paulo Silva
 */
public class FindPrimes extends JFrame
{
    private final JTextField highestPrimeJTextField = new JTextField();
    private final JButton getPrimesJButton = new JButton("Get Primes");
    private final JTextArea displayPrimesJTextArea = new JTextArea();
    private final JButton cancelJButton = new JButton("Cancel");
    private final JProgressBar progressJProgressBar = new JProgressBar();
    private final JLabel statusJLabel = new JLabel();
    private PrimeCalculator calculator;
    
    public FindPrimes()
    {
        super("Finding Primes with SwingWorker");
        setLayout(new BorderLayout());
        
        // Inicializa o painel para obter um número a partir do usuário
        JPanel northJPanel = new JPanel();
        northJPanel.add(new JLabel("Find primes less than: "));
        highestPrimeJTextField.setColumns(5);
        northJPanel.add(highestPrimeJTextField);
        getPrimesJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    progressJProgressBar.setValue(0);
                    displayPrimesJTextArea.setText("");
                    statusJLabel.setText("");
    
                    int number;
    
                    try
                    {
                        // Obtém entrada de usuário
                        number = Integer.parseInt(highestPrimeJTextField.getText());
                    }
                    catch (NumberFormatException ex)
                    {
                        statusJLabel.setText("Enter an integer.");
                        
                        return;
                    }
    
                    // Constrói um novo objeto PrimeCalculator
                    calculator = new PrimeCalculator(number, displayPrimesJTextArea,
                            statusJLabel, getPrimesJButton, cancelJButton);

                    // Ouve alterações de propriedades da barra de progresso
                    calculator.addPropertyChangeListener(
                        new PropertyChangeListener()
                        {
                            public void propertyChange(PropertyChangeEvent e)
                            {
                                // Se a propriedade alterada for progress, atualiza a barra de progresso
                                if (e.getPropertyName().equals("progress"))
                                {
                                    int newValue = (Integer) e.getNewValue();
                                    progressJProgressBar.setValue(newValue);
                                }
                            }
                        }
                    );

                    // Desativa o botão Get Primes e ativa o botão Cancel
                    getPrimesJButton.setEnabled(false);
                    cancelJButton.setEnabled(true);
                    calculator.execute();
                }
            }
        );
        
        northJPanel.add(getPrimesJButton);

        // Adiciona uma JList rolável para exibir os resultados do cálculo
        displayPrimesJTextArea.setEditable(false);
        
        add(new JScrollPane(displayPrimesJTextArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    
        // Inicializa um painel para exibir cancelJButton, progressJProgressBar e statusJLabel
        JPanel southJPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        cancelJButton.setEnabled(false);
        cancelJButton.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        calculator.cancel(true);
                    }
                }
            );
        
        southJPanel.add(cancelJButton);
        progressJProgressBar.setStringPainted(true);
        southJPanel.add(progressJProgressBar);
        southJPanel.add(statusJLabel);

        add(northJPanel, BorderLayout.NORTH);
        add(southJPanel, BorderLayout.SOUTH);
        setSize(350, 300);
        setVisible(true);
    }

    // Método main inicia a execução de programa
    public static void main(String[] args)
    {
        FindPrimes application = new FindPrimes();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
