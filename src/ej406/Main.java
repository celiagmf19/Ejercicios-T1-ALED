package ej406;

public class Main {

	public static void main(String[] args) {
		String texto = "hola.quetal,hola";
		System.out.println(cambio(texto));
	}
	
	
	private static String cambio(String texto) {
		if(texto==null) {
			return null;
		}
		
		StringBuilder cambiado = new StringBuilder();
		for(int i=0; i<texto.length(); i++) {
			char c = texto.charAt(i);
			if(texto.charAt(i)==',') {
				cambiado.append('.');
			} else if(texto.charAt(i)=='.') {
				cambiado.append(',');
			} else{
				cambiado.append(c);
			}
		}
		return cambiado.toString();
	}

}
