package ej316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las dimensiones de la matriz: ");
		mostrarMatriz(crearMatriz(sc));
		sc.close();
	}
	
	private static int[][] crearMatriz(Scanner sc){
		int dimension = sc.nextInt();
		int[][] matriz = new int[dimension][dimension];
		for(int i=0; i<dimension; i++) {
			for(int j=i; j<dimension;j++) {
				matriz[i][j] = (int)(Math.random()*100);
				matriz[j][i] = matriz[i][j];
			}
		}
		return matriz;
	}
	
	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " ");
			} 
			System.out.println();
		}	
	}
}
