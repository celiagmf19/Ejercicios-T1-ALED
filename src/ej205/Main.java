package ej205;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			for(int numero = 1; numero<=10; numero++) {
				int multiplicacion = numero*i;
				System.out.println(numero+"*"+i+"="+multiplicacion);
			}
		}
	}
	
}
