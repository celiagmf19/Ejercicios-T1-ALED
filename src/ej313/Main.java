package ej313;

public class Main {

	public static void main(String[] args) {
		
		int[] datos = new int[23];
		for (int i = 0; i < datos.length; i++) {
			datos[i] = i;
		}

		int[][] segmentos = dividir(datos, 5);
		for (int i = 0; i < segmentos.length; i++) {
			System.out.println("Segmento " + i + ": longitud " + segmentos[i].length);
		}

	}

	private static int[][] dividir(int[] datos, int partes){
		if (datos == null || datos.length == 0 || partes <= 0) {
			return new int[0][];
		}
		
		int numSegmentos = (int) Math.ceil((double) datos.length / partes);
		int[][] segmentos = new int[numSegmentos][];
		for (int i = 0; i < numSegmentos; i++) {
			int inicio = i * partes;
			int fin = Math.min(inicio + partes, datos.length);
			int[] segmento = new int[fin - inicio];
			for (int j = 0; j < segmento.length; j++) {
				segmento[j] = datos[inicio + j];
			}
			segmentos[i] = segmento;
		}
		return segmentos;
	}
}
