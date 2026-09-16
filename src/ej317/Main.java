package ej317;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero para que sea el umbral: ");
		float[] numeros = {1f,2f,3f,4f,5f,6f,7f,8f};
		System.out.println(Arrays.toString(umbralizar(numeros,sc)));
		sc.close();
	}
	
	private static float[] umbralizar(float[] datos, Scanner sc) {
		int umbral = sc.nextInt();
		int posicion = 0;
		int total = 0;
		
		for(int i=0;i<datos.length;i++) {
			if(datos[i]>umbral) {
				total++;
			}
		}
		
		float[] umbrales = new float[total];
		
		for(int i=0;i<datos.length;i++) {
			if(datos[i]>umbral) {
				umbrales[posicion]=datos[i];
				posicion++;
			}
		}
		return umbrales;
	}

}
