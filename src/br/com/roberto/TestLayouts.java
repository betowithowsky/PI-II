/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberto;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author roberto.jwsilva
 */
public class TestLayouts {
    public static void main(String[] args) {
        Runnable thread = new Runnable() {
            //Classe Anonima Onde ficam os threads
            public void run() {
                
                criarGUI();
                
            }
            
        };
         SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI(){
        JFrame frame = new JFrame();
        
        //frame.setMinimumSize(new Dimension(400,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing App 03");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(new GridLayout(3, 0));
        JButton button01 = new JButton("Botão 01");
        panel.add(button01);
        JButton button02 = new JButton("Botão 02");
        panel.add(button02);
        JButton button03 = new JButton("Botão 03");
        panel.add(button03);
        
        frame.pack();
        frame.setVisible(true);
    }
}
