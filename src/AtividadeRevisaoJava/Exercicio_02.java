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
public class Exercicio_02 {
    public static void main(String[] args) {
        leitura();
    }
    
    public static void leitura(){
        Scanner input = new Scanner(System.in);
        
        while(true){
        try{
           System.out.println("Digite um Numero: ");
            String num = input.nextLine();
            int n = Integer.parseInt(num);
            imparPar(n);
            break;
        }
        catch(NumberFormatException e){
            System.err.println("Você Não Digitou um Numero!");
            }
        }
        
    }
    
        public static void imparPar(int num){
        if(num % 2 == 0){
            System.out.println("Par");
        }else
            System.out.println("Impar");
    }
}
