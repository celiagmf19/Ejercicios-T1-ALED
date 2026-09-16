package ej203;

public class Main {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;
		
		for(int i = 5; i<=100; i+=5) {
			contador++;
			System.out.println(i);
			suma = suma + i;
		}
		System.out.println("Contador:"+contador);
		System.out.println("Suma:"+suma);
	}
}