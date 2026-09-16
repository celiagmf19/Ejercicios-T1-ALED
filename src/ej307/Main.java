package ej307;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		int valor = 2;
		System.out.println("Array original: "+Arrays.toString(numeros)+"\nMultipliado por: "+valor+"\nSolución: "+Arrays.toString(copiar(numeros, valor)));
	}

	private static int[] copiar(int[] datos, int factor) {
		int[] copiado = new int[datos.length];
		for(int i=0;i<datos.length;i++) {
			copiado[i] = datos[i]*factor;
		}
		return copiado;
	}
	
}
