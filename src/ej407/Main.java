package ej407;

public class Main {

	public static void main(String[] args) {
		String texto = "65.97";
		if(validar(texto) == true) {
			System.out.println("Número válido");
		} else {
			System.out.println("Número inválido");
		}

	}
	
	public static boolean validar(String texto) {
		if(texto==null || texto.length()==0) {
			return false;
		}
		
		boolean haySeparador = false;
		
		for(int i = 0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			
			if(!Character.isDigit(c) && c != ',' && c != '.' ) {
				return false;
			}
			if(c == ',' || c == '.') {
				if(haySeparador == true) {
					return false;
				}
				haySeparador = true;
			}
		}
			
		return true;
	}
	
}
