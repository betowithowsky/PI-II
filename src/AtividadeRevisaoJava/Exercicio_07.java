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
public class Exercicio_07 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite o Numero de alunos:");
        int numA = input.nextInt();
        System.out.println("A media da Sala é de:" + mediaNotas(numA));  
    }
    
    public static double mediaNotas(int num){
        double notas = 0;
        for(int i = 0;i < num;i++){
            System.err.printf("Digite a Nota do Aluno %s",i);
            notas += input.nextDouble();
        }
        return notas/num;
    }
}
