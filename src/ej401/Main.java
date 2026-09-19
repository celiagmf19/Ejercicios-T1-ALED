package ej401;

public class Main {

	public static void main(String[] args) {
		
		String texto = "abc123";
		System.out.println(primerNumero(texto));

	}
	
	private static String primerNumero(String texto) {
		
		if(texto.isEmpty() || texto ==null) {
			return null;
		}
		
		StringBuilder numero = new StringBuilder();
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(Character.isDigit(c)) {
				numero.append(c);
			} else if(numero.length()>0) {
				break;
			}
		}
		 
		if(numero.length()>0) {
			return numero.toString();
		}
		return null;
	}

}
