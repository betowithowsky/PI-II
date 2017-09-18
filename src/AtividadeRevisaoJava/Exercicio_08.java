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
public class Exercicio_08 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o Numero de Numeros Que vai Digitar:");
        int num = input.nextInt();
        
        System.out.println("Você acertou o numero na Rodada: " + maiorNumero(num));
    }
    
    public static int maiorNumero(int num){
        int mNum = 0;
        int count = 0;
        int rodada = 0;
        
        for(int i = 0; i < num ; i++){
            System.out.println("Digite um Numero inteiro: ");
            int nums = input.nextInt();
            count++;
            
            if(nums > mNum){
                mNum = nums;
                rodada = count;
            }
            
        }
        return rodada;
    }
}
