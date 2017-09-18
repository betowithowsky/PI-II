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
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da Matriz: ");
        int t = input.nextInt();
        
        int[][] matriz1 = new int[t][t];
        int[][] matriz2 = new int[t][t];
        
        int[][] sMatriz = new int[t*2][t*2];
        
        populaMatriz(matriz1, matriz2);
        System.out.println("\nMatriz 1");
        imprimiMatriz(matriz1);
        System.out.println("\nMatriz 2");
        imprimiMatriz(matriz2);
        
        somaMatriz(matriz2, matriz1, t,sMatriz);
        System.out.println("Soma das matrizes");
        imprimiMatriz(sMatriz);
        
    }
    
    public static void populaMatriz(int[][] matriz,int[][] matriz2){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = 1;
            }
        }
        for(int i = 0; i < matriz2.length;i++){
            for(int j = 0; j < matriz2[i].length;j++){
                matriz2[i][j] = 2;
            }
        }
    }
    
    public static void somaMatriz(int[][] matriz,int[][] matriz1,int t,int[][] sMatriz){
        
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                sMatriz[i][j] = matriz[i][j];
            }
        }
        for(int i = 0; i < matriz1.length;i++){
            for(int j = 0; j < matriz1[i].length;j++){
                sMatriz[i+t][j+t] = matriz1[i][j];
            }
        }
    }
    
    public static void imprimiMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
