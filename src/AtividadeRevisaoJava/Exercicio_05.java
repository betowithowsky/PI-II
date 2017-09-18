/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeRevisaoJava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class Exercicio_05 {
    public static void main(String[] args) {
        adivinha();
    }
    
    public static void adivinha(){
        Random rnd = new Random();
        String numrnd = Integer.toString(rnd.nextInt(11));
        
        Scanner input = new Scanner(System.in);
        System.out.println(numrnd);
        System.out.println("Adivinhe o Numero!!\nDe 0 a 10\nou escreva 'desistir' para sair");
        
        while(true){
            String num;
            System.out.print("Digite um Numero:");
            num = input.next();
            
            if(num.equals(numrnd)){
                System.out.println("Parabéns vc Acertou!!");
                break;
            }else{
                System.out.println("Errou, Tente Novamente...");
            }
            if(num.equals("desistir")){
                System.out.printf("Pediu pra Sair, o numero era o %s\n",numrnd);
                break;
            }
            
        }
    }
}
