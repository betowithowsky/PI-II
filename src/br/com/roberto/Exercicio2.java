/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Beto
 */
public class Exercicio2 {
        
    public static void main(String[] args) {
        
        
        Runnable thread = new Runnable() {
            //Classe Anonima Onde ficam os threads
            public void run() {
                
                criarGUI();
                
            }
            
        };
        //executa a funcão acima
        SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI(){
        int tentativas = 3;
        
        Random gerador = new Random();
        String gnum = Integer.toString(gerador.nextInt(11));
        
        
        //Instancia Panel
        JPanel panel = new JPanel();
        
        final JFrame frame = new JFrame();
        
        final JTextField fieldNum = new JTextField(10);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Adivinha 0 a 10");
        
        JLabel labelNome = new JLabel("Digite um Numero:");

        JButton buttonApply = new JButton("Confirmar");
        
        buttonApply.addActionListener(new ActionListener() {
            private int count;
            @Override
            public void actionPerformed(ActionEvent e) {
                    String num = fieldNum.getText();
                    if(num.equals(gnum)){
                        JOptionPane.showMessageDialog(frame, "Acertou!");
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "Errou!");
                        this.count++;
                    }
                    if(count == tentativas){
                    System.exit(0);
                    }
                }
        });
        
        
        
        frame.getContentPane().add(panel);
        panel.add(labelNome);
        panel.add(fieldNum);
        
        panel.add(buttonApply);
        
        frame.pack();
        frame.setVisible(true);
    }
}

