package ej314;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		float[] numeros = {-1f, -3f, 2f, 6f, 8f, -9f};
		System.out.println(Arrays.toString(normalizar(numeros)));
		
	}
	
	private static float[] normalizar(float[] datos) {
		
		if(datos==null || datos.length==0) {
			return new float[0];
		}
		
		
		float maximo=0f;
		float[] normalizado = new float[datos.length];
		
		for(int i=0; i<datos.length; i++) {
			if(datos[i]>maximo) {
				maximo=datos[i];
			}
		}
		
		for(int i=0; i<datos.length; i++) {
			normalizado[i]=datos[i]/maximo;
		}
		
		return normalizado;
	}

}
