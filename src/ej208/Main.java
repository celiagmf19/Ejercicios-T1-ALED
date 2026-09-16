package ej208;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca las coordenadas del primer vector:");
		double[] v1 = leerVector(sc);
		
		System.out.println("Introduzca las coordenadas del primer vector:");
		double[] v2 = leerVector(sc);
		
		sc.close();
		
		double productoEscalar = calcularProductoEscalar(v1, v2);
		System.out.println("\nProducto escalar: " + productoEscalar);
	}
	
	private static double[] leerVector(Scanner sc) {
		double[] vector = new double[3];
		String[] nombres = { "X", "Y", "Z" };

		for (int i = 0; i < 3; i++) {
			System.out.print("Componente " + nombres[i] + ": ");
			vector[i] = sc.nextDouble();
		}

		return vector;
	}
	
	private static double calcularProductoEscalar(double[] v1, double[] v2) {
		double resultado = 0.0;
		for (int i = 0; i < 3; i++) {
			resultado += v1[i] * v2[i];
		}
		return resultado;
	}
	
}
