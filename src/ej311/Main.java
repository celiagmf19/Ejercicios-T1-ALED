package ej311;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números (0 para terminar):");
		procesar(sc);
		sc.close();

	}

	public static void procesar(Scanner sc) {
		int numeros = 0;
		long suma = 0;
		int maximo = Integer.MAX_VALUE;
		int minimo = Integer.MIN_VALUE;
		
		while(sc.hasNextInt()) {
			if(sc.nextInt()==0) {
				break;
			}
			numeros++;
			suma = suma+sc.nextInt();
			minimo = Math.min(sc.nextInt(), minimo);
			maximo = Math.max(maximo, sc.nextInt());
		}
		
		if(numeros==0) {
			System.out.println("No se introdujeron datos");
		}
		
		System.out.println("Media: "+((double)suma/numeros));
		System.out.println("Mínimo: "+minimo);
		System.out.println("Máximo: "+maximo);
	}
	
}
