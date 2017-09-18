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
public class Exercicio5 {
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
        
        final JTextField fieldNum1 = new JTextField(10);
        final JTextField fieldNum2 = new JTextField(10);
        final JTextField fieldNum3 = new JTextField(10);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Media de 3 Valores");
        
        JLabel label1V = new JLabel("Digite o 1º Valor:");
        JLabel label2V = new JLabel("Digite o 2º Valor:");

        
        JButton buttonSoma = new JButton("Soma");
        JButton buttonSub = new JButton("Subitração");
        JButton buttonMulpl = new JButton("Multiplicação");
        JButton buttonDivi = new JButton("Divisão");
        
        buttonSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v1 = Integer.parseInt(fieldNum1.getText());
                double v2 = Integer.parseInt(fieldNum2.getText());
                
                double total = v1+v2;
                JOptionPane.showMessageDialog(frame, total);
                
                }
        });
        
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v1 = Integer.parseInt(fieldNum1.getText());
                double v2 = Integer.parseInt(fieldNum2.getText());
                
                double total = v1-v2;
                JOptionPane.showMessageDialog(frame, total);
                
                }
        });
        
        buttonMulpl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v1 = Integer.parseInt(fieldNum1.getText());
                double v2 = Integer.parseInt(fieldNum2.getText());
                
                double total = v1*v2;
                JOptionPane.showMessageDialog(frame, total);
                
                }
        });
        
        buttonDivi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double v1 = Integer.parseInt(fieldNum1.getText());
                double v2 = Integer.parseInt(fieldNum2.getText());
                
                double total = v1/v2;
                JOptionPane.showMessageDialog(frame, total);
                
                }
        });
        
        frame.getContentPane().add(panel);
        
        panel.add(label1V);
        panel.add(fieldNum1);
        
        panel.add(label2V);
        panel.add(fieldNum2);
        
        panel.add(buttonSoma);
        panel.add(buttonSub);
        panel.add(buttonMulpl);
        panel.add(buttonDivi);
        
        frame.pack();
        frame.setVisible(true);
    }
}
