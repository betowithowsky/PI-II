package br.com.roberto;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author roberto.jwsilva
 */
public class Exercicio1 {
    static String nome,sobrenome,endereco,telefone;
    
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
        //Instancia Panel
        JPanel panel = new JPanel();
        
        //Nova Instancia de um JFrame
        final JFrame frame = new JFrame();
        
        //instancia um textfield = form
        final JTextField fieldNome = new JTextField(10);
        final JTextField fieldSobrenome = new JTextField(10);
        final JTextField fieldEndereco = new JTextField(10);
        final JTextField fieldTelefone = new JTextField(10);
        
        //instancia um checkbox
        //JCheckBox checkBox01 = new JCheckBox("Item 01");
        //JCheckBox checkBox02 = new JCheckBox("Item 02");
        
        //instancia radiobutton
        //JRadioButton radio01 = new JRadioButton("Opção 01");
        //JRadioButton radio02 = new JRadioButton("Opção 02");
        
        //Definindo a operação principal de fechamento do jfram
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Define o tamanho da Janela
        //frame.setMinimumSize(new Dimension(250,150));
        
        //Titulo da Janela
        frame.setTitle("Cadastro Cliente");
        
        //Defique oque vai ter dentro do JLabel
        JLabel labelNome = new JLabel("Nome");    
        JLabel labelSobrenome = new JLabel("Sobrenome");
        JLabel labelEndereco = new JLabel("Endereço");
        JLabel labelTelefone = new JLabel("Telefone");
        
        //Menu Drop Down
        //String[] opcoesCombo = {"Selecionae", "Opção 01", "Opção 02","Opção 03", "Opçãs 04"};
        //JComboBox comboBox = new JComboBox(opcoesCombo);
                
        //Define oque tem escrito dentro do botao
        JButton buttonApply = new JButton("Aplicar");
        JButton buttonExib =  new JButton("Exibir");

        //Classe Anonima Button - adiciona uma ação para o button
        buttonApply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    
                    //JOptionPane.showMessageDialog(frame, "Salvo com Sucesso." + fieldNome.getText());
                    JOptionPane.showMessageDialog(frame, "Salvo com Sucesso.");
                    nome = fieldNome.getText();
                    sobrenome = fieldSobrenome.getText();
                    endereco = fieldEndereco.getText();
                    telefone = fieldTelefone.getText();
                }
        });
         
        //Classe Anonima CheckBox
        //checkBox01.addItemListener(new ItemListener(){
        //    @Override
        //    public void itemStateChanged(ItemEvent e){
        //        if(e.getStateChange() == ItemEvent.SELECTED) {
        //            System.out.println("selecionado");
        //         }
        //        }
        //    });
        
        //Adiciona uma ação Para o Botão 2
        buttonExib.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Nome: " + nome +
                                                    "\n Sobrenome: " + sobrenome +
                                                    "\nEndereço: " + endereco +
                                                    "\nTelefone: " + telefone); 
            }
        });
        
        
        
        //Criando um Panel
        frame.getContentPane().add(panel);
        
        //Tudo que é filho do panel
        panel.add(labelNome);
        panel.add(fieldNome);
        
        panel.add(labelSobrenome);
        panel.add(fieldSobrenome);
        
        panel.add(labelEndereco);
        panel.add(fieldEndereco);
        
        panel.add(labelTelefone);
        panel.add(fieldTelefone);
        
        panel.add(buttonApply);
        panel.add(buttonExib);
        
        //panel.add(checkBox01);
        //panel.add(checkBox02);
        
        //panel.add(radio01);
        //panel.add(radio02);    
        
        //panel.add(comboBox);
        
        //Cria o Grupo de RadioBotton - onde o usuario só consegue selecionar um dos botoes.
        //ButtonGroup group = new ButtonGroup();
        //group.add(radio01);
        //group.add(radio02);
        
        
        //Exibir a Janela
        frame.pack();
        frame.setVisible(true);
        
        
        
        
    }
}
