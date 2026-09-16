package ej204;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una serie de números enteros (para terminar, introduzca un número negativo)");
	
		int minimo = Integer.MIN_VALUE;
		int maximo = Integer.MAX_VALUE;
		boolean seguir = false;
		
		while(true) {
			System.out.println("Número:");
			int numero = sc.nextInt();
			
			if(numero<0) {
				break;
			}
			
			seguir = true;
			if(numero<minimo) {
				minimo = numero;
			}
			if(numero>maximo) {
				maximo=numero;
			}
		}
		sc.close();
		if(!seguir) {
			System.out.println("No hay números positivos");
		}
		else {
			System.out.println("Máximo"+maximo);
			System.out.println("Mínimo"+minimo);
		}
	}
	
}
