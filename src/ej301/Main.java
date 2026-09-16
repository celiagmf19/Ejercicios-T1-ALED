package ej301;

public class Main {

	public static void main(String[] args) {
		float suma = 0;
		float[] numeros = {1f, 2f, 3f, 4f, 5f};
		
		for(int i=0; i<=numeros.length; i++) {
			suma = suma+numeros[i];
		}
		
		System.out.println(suma);
	}
	
}
