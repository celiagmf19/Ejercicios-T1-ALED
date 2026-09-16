package ej302;

public class Main {
	
	public static void main(String[] args) {
		
		int[] datos = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(buscar(datos,2));
		System.out.println(buscar(datos,9));
	}

	private static int buscar(int[] datos, int numero) {
	
		int posicion=-1;
		if(datos==null) {
			return posicion;
		}
		
		for(int i=0; i<datos.length; i++) {
			if(datos[i]==numero) {
				posicion = i;
			}
		}
		
		return posicion;
	}
}
