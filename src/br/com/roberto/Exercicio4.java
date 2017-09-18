/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberto;

import static br.com.roberto.Exercicio1.nome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class Exercicio4 {
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
        
        ArrayList<Jogos> colecao = new ArrayList<Jogos>();
            
        JPanel panel = new JPanel();    
        
        final JFrame frame = new JFrame();
        
        final JTextField fieldNome = new JTextField(10);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("Media de 3 Valores");
        
        JLabel labelNome = new JLabel("Digite o Nome Do Jogo:");
        JLabel label2V = new JLabel(":");
        
        String[] opcoesCombo = {"Selecionae", "Ação", "Aventura", "Estratégia", "RPG", "Esporte", "Corrida", "Simulaçã", "Outros"};
        JComboBox comboBox = new JComboBox(opcoesCombo);
        
        JButton buttonApply = new JButton("Salvar");
        JButton buttonExibir = new JButton("Exibir");
        
        buttonApply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    
                    //JOptionPane.showMessageDialog(frame, "Salvo com Sucesso." + fieldNome.getText());
                    
                    Jogos j = new Jogos();
                    j.setNome(fieldNome.getText());
                    j.setGenero((String) comboBox.getSelectedItem());
                    colecao.add(j);
                    
                    JOptionPane.showMessageDialog(frame, "Salvo com Sucesso.");
                }
        });
        
        buttonExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(frame, apresentaDados(colecao)); 
            }
        });
        
        
        frame.getContentPane().add(panel);
        
        panel.add(labelNome);
        panel.add(fieldNome);
        
        panel.add(comboBox);
        
        panel.add(buttonApply);
        panel.add(buttonExibir);
        
        
        
        frame.pack();
        frame.setVisible(true);
        }
        
        public static String apresentaDados(ArrayList<Jogos> colecao){
            String texto = "";
            for (Jogos j : colecao) {
                String nome = (String) j.getName();
                String genero = (String) j.getGenero();
                texto += "Nome: " + nome;
                texto += " Genero: " + genero + "\n";
            }
            return texto;
        }
}
