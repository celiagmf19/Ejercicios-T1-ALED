package ej207;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		int numero = sc.nextInt();
		sc.close();
		
		System.out.println(numero + " = ");
		descomponer(numero);
		System.out.println();
	}
	
	
	private static void descomponer(int n) {
		int original = n;
		boolean primera = true;

		while (n % 2 == 0) {
			if (!primera) {
				System.out.print(" x ");
			}
			System.out.print("2");
			n /= 2;
			primera = false;
		}

		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				if (!primera) {
					System.out.print(" x ");
				}
				System.out.print(i);
				n /= i;
				primera = false;
			}
		}

		if (n > 1) {
			if (!primera) {
				System.out.print(" x ");
			}
			System.out.print(n);
		}
	}
}
