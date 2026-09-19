package ej410;

public class Main {

	public static void main(String[] args) {
		String texto = "dabale arroz a la zorra el abad";
		if(palindromo(texto)==true) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}

	}
	
	public static boolean palindromo(String texto) {
		
		if(texto==null) {
			return false;
		}
		
		String reves = new StringBuilder(texto).reverse().toString().replace(" ", "");
		
		if(texto.replace(" ", "").equals(reves)) {
			return true;
		}
		
		return false;
	}

}
