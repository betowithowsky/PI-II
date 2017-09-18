/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeRevisaoJava;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        
        leitura();
        System.out.println("FIM DO PROGRAMA.");
        
        
    }
    
    public static void leitura(){
        Scanner input = new Scanner(System.in);
        
        while(true){
        try{
           System.out.println("Digite um Numero: ");
            String num = input.nextLine();
            int n = Integer.parseInt(num);
            verifica(n);
            break;
        }
        catch(NumberFormatException e){
            System.err.println("Você Não Digitou um Numero!");
            }
        }
        
    }
    
    public static void verifica(int num){
        if(num >= 50){
            System.out.println("SUCESSO");
        }else
            System.out.println("ERRO");
    }
    
}
