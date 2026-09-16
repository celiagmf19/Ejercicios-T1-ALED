package ej309;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		char[] info = {'a','b','c','d'};
		System.out.println("Original: "+Arrays.toString(info)+"\nCambiado: "+Arrays.toString(cambiar(info)));

	}
	
	private static char[] cambiar(char[] datos) {
		char[] cambiado = new char[datos.length];
		for(int i=0;i<datos.length;i++){
			cambiado[i]=datos[datos.length-(i+1)];
		}
		return cambiado;
	}

}
