package ej409;

public class Main {

	public static void main(String[] args) {
		String texto = "Hola, me llamo Celia";
		System.out.println(alReves(texto));

	}
	
	private static String alReves(String texto) {
		
		if(texto==null || texto.length()==0) {
			return null;
		}
		
		StringBuilder reves = new StringBuilder();
		
		for(int i=texto.length()-1; i>=0; i--) {
			char c = texto.charAt(i);
			reves.append(c);
		}
		return reves.toString();
	}
	
	// Se podía haber usado StringBuilder.reverse()

}
