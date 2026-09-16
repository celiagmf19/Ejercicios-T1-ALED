package ej206;

public class Main {

	public static void main(String[] args) {
		int contador = 0;
		int numero = 0;
		
		while(contador<100) {
			if(esPrimo(numero)) {
				System.out.println(numero);
				contador++;
			}
			numero++;
		}
	}
	
	private static boolean esPrimo(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
