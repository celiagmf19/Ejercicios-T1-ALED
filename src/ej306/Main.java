package ej306;

public class Main {

	public static void main(String[] args) {
		float[][] matriz = {
				{1,2,3},{5,6,7},{8,9,10}
		};
		
		float[] maximos = maximosPorFila(matriz);
		for(int i=0; i<maximos.length;i++) {
			System.out.println("Máximo en fila "+i+":"+maximos[i]);
		}
	}

	private static float[] maximosPorFila(float[][] matriz) {
		if (matriz == null) {
			return new float[0];
		}
		float[] maximos = new float[matriz.length];
		for (int fila = 0; fila < matriz.length; fila++) {
			maximos[fila] = maximoFila(matriz[fila]);
		}
		return maximos;
	}

	
	private static float maximoFila(float[] fila) {
		if(fila==null||fila.length==0) {
			return Float.NaN;
		}
		float maximo = fila[0];
		for(int i=0; i<fila.length; i++) {
			if(fila[i]>maximo) {
				maximo = fila[i];
			}
		}
		return maximo;
	}
	
}
