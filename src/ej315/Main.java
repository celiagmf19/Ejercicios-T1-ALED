package ej315;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		float[] numeros = {1f,2f,3f,4f,5f,4f,3f,6f,4f};
		System.out.println(Arrays.toString(maximos(numeros)));
	}
	
	public static float[] maximos(float[] datos) {

		int totales = 0;
		
		if(datos==null||datos.length==0) {
			return new float[0];
		}
		
		for(int i=1; i<datos.length-1; i++) {
			float anterior = datos[i-1];
			float posterior = datos[i+1];
			if(datos[i]>anterior && datos[i]>posterior) {
				totales++;
			}
		}
		
		float[] total = new float[totales];
		int posicion = 0;
		
		for(int i=1; i<datos.length-1; i++) {
			float anterior = datos[i-1];
			float posterior = datos[i+1];
			if(datos[i]>anterior && datos[i]>posterior) {
				total[posicion] = datos[i];
				posicion++;
			}
		}
		
		return total;

	}
}
