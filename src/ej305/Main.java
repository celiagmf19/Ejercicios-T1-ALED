package ej305;

public class Main {

	public static void main(String[] args) {
		
		float[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		float suma=0;
		for(int i=0; i<datos.length; i++) {
			suma=suma+datos[i];
		}
		System.out.println(suma/datos.length);
	}

}
