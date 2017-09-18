/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeRevisaoJava;

/**
 *
 * @author Beto
 */
public class Exercicio_06 {
    public static void main(String[] args) {
        int[][] matriz = new int[9][9];
        
        System.out.println("Taboada!");
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("-------------------------------");
        taboada(matriz);
        imprimiMatriz(matriz);
        
    }
    
    public static void taboada(int[][] matriz){
        int mult = 0;
        for(int i = 0; i < matriz.length;i++){
            mult+=1;
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] += (j+1) * mult; 
            }
        }
    }
    
    public static void imprimiMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length;i++){
            System.out.printf("%s |",i+1);
            for(int j = 0;j<matriz[i].length;j++){
                System.out.print("  " + matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
