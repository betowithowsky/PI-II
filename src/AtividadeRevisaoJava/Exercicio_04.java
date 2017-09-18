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
public class Exercicio_04 {
    public static void main(String[] args) {
        resultado(mediaAritimetica(pegaNumeros()));
    }
    
    public static int pegaNumeros(){
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.err.println("Digite 5 Numeros");
        for(int i = 0; i <= 4;i++){
            System.out.println("Digite um Numero["+ (i+1) + "]:");
            num += input.nextInt();
        }
        return num;
    }
    
    public static double mediaAritimetica(int num){
        return num/5;
    }
    
    public static void resultado(double media){
        //Se a média for menor que 5, exibir “REPROVADO”
        //Se a média for maior ou igual a 5 e menor que 9, exibir “APROVADO”
        //Se a média for 9, exibir “PARABÉNS”
        //Se a média for 10, exibir “MASTER OF THE UNIVERSE”
        System.out.println("Media:" + media);
        if(media < 5){
            System.err.println("REPROVADO");
        }
        else if(media >= 5 && media < 9){
            System.err.println("APROVADO");
        }
        else if(media == 9){
            System.out.println("PARABÉNS");
        }
        else if(media >= 10){
            System.out.println("MASTER OF THE UNIVERSE");
        }
    }
}
