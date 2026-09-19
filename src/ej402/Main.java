package ej402;

public class Main {

	public static void main(String[] args) {
		
		String texto = "abc123aaa";
		System.out.println(numeroChar(texto,'a'));

	}
	
	private static int numeroChar(String texto, char buscado) {
		
		if(texto ==null) {
			return 0;
		}
		
		int veces = 0;
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(c==buscado) {
				veces++;
			}
		}
		 
		return veces;
	}

}
