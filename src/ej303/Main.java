package ej303;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] datos = new int[300];
		
		for(int i=0; i<datos.length; i++) {
			datos[i] = i%16;
		}
		
		System.out.println(Arrays.toString(datos));
	}

}
