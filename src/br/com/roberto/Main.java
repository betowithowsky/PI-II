package br.com.roberto;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto.jwsilva
 */
public class Main {
    public static void main(String[] args) {
        
        Runnable thread = new Runnable() {
            
            public void run() {
                
                criarGUI();
                
            }
        };
        
        SwingUtilities.invokeLater(thread);
    }
    
    public static void criarGUI(){
        //Nova Instancia de um JFrame
        JFrame frame = new JFrame();
        
        //Definindo a operação principal de fechamento do jfram
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Criando um Label
        JLabel label = new JLabel("Olá, Mundo!");
        frame.getContentPane().add(label);
        
        //Exibir a Janela
        frame.pack();
        frame.setVisible(true);
        
        
    }
        
}