package ej304;

public class Main {

	public static void main(String[] args) {
		char[] datos = new char[300];
		for(int i=0; i<datos.length; i++){
			datos[i] = (char)(i%16);
			System.out.printf("%X",(int)datos[i]);
		}
		
	}

}
