package ej308;

public class Main {

	public static void main(String[] args) {
		
		float[] numeros = {-1,1,-9,0,-5,8,4,6,-3};
		System.out.println("Números negativos: "+contarNegativos(numeros));
		
	}
	
	private static int contarNegativos(float[] datos) {
		int contador = 0;
		for(int i=0; i<datos.length;i++) {
			if(datos[i]<0) {
				contador++;			}
		}
		return contador;
	}

}
