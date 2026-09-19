package ej408;

public class Main {

	public static void main(String[] args) {
		String texto = "Hola, me llamo Celia";
		System.out.println(contarVocales(texto));

	}
	
	private static int contarVocales(String texto) {
		
		if(texto==null || texto.length()==0) {
			return 0;
		}
		
		int vocales = 0;
		
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vocales++;
			}
		}
		return vocales;
	}

}
