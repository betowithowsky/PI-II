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
public class Exercicio_03 {
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
            verifica(n);
            break;
        }
        catch(NumberFormatException e){
            System.err.println("Você Não Digitou um Numero!");
            }
        }
        
    }
public static void verifica(int num){
    if(num >= 0 && num <= 9){
        
        switch(num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
        }
    }else
        System.err.println("! Erro.. O Numero é Menor que 0 ou Maior que 9");
}
}