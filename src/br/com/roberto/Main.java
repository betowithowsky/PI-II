package br.com.roberto;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
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
        //Instancia Panel
        JPanel panel = new JPanel();
        
        //Nova Instancia de um JFrame
        final JFrame frame = new JFrame();
        
        //instancia um textfield = form
        final JTextField field = new JTextField(10);
        
        //instancia um checkbox
        JCheckBox checkBox01 = new JCheckBox("Item 01");
        JCheckBox checkBox02 = new JCheckBox("Item 02");
        
        //instancia radiobutton
        JRadioButton radio01 = new JRadioButton("Opção 01");
        JRadioButton radio02 = new JRadioButton("Opção 02");
        
        //Definindo a operação principal de fechamento do jfram
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Define o tamanho da Janela
        //frame.setMinimumSize(new Dimension(250,150));
        
        //Titulo da Janela
        frame.setTitle("Swing App");
        
        //Defique oque vai ter dentro do JLabel
        JLabel label = new JLabel("Olá, Mundo!");
        
        //Define oque tem escrito dentro do botao
        JButton button = new JButton("Button");
        JButton button2 =  new JButton("Botao 02");

        //Classe Anonima Button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Valor Digitado:" + field.getText());
                }
        });
         
        //Classe Anonima CheckBox
        checkBox01.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("selecionado");
                 }
                }
            });
           
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Item 01 selecionado: " + checkBox01.isSelected() +
                                                    "\n item 02 selecionado" + checkBox02.isSelected() +
                                                    "\nRadio 01 Selecionado" + radio01.isSelected() +
                                                    "\nRadio 02 Selecionado" + radio02.isSelected()); 
            }
        });
        //Criando um Panel
        frame.getContentPane().add(panel);
        
        //Tudo que é filho do panel
        panel.add(label);
        
        panel.add(field);
        
        panel.add(button);
        panel.add(button2);
        
        panel.add(checkBox01);
        panel.add(checkBox02);
        
        panel.add(radio01);
        panel.add(radio02);    
        
        //Cria o Grupo de RadioBotton - onde o usuario só consegue selecionar um dos botoes.
        ButtonGroup group = new ButtonGroup();
        group.add(radio01);
        group.add(radio02);
        
        
        //Exibir a Janela
        frame.pack();
        frame.setVisible(true);
        
        
        
        
    }
        
}