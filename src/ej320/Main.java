package ej320;

public class Main {

	public static void main(String[] args) {
		int[] muestras = { 10, 20, 40, 70 };
		int[] resultado = interpolar(muestras);
		for (int valor : resultado) {
			System.out.println(valor);
		}
	}

	private static int[] interpolar(int[] muestras) {
		int[] interpolado = new int[muestras.length*2-1];
		for(int i=0; i<muestras.length; i++) {
			int media = (muestras[i]+muestras[i+1])/2;
			interpolado[i] = muestras[i];
			interpolado[i+1] = media;
			interpolado[i+2] = muestras[i+1];
		}
		return interpolado;
	}
}
