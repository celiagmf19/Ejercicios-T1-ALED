package ej318;

public class Main {

	public static void main(String[] args) {
		float[] datos = { 1f, 2f, 3f, 4f, 5f, 6f };
		float[] medias = filtrar(datos, 3);
		for(int i=0; i<medias.length; i++) {
			System.out.println(medias[i]);
		}
	}

	
	private static float[] filtrar(float[] datos, int ventana) {
		float[] filtrado = new float[datos.length-ventana+1];
		float suma = 0f;
		for(int i=0;i<filtrado.length||i>=0;i++) {
			for (int j = i; j < i + ventana; j++) {
				suma += datos[j];
			}
			filtrado[i]=suma/ventana;
		}
		return filtrado;
	}
}
