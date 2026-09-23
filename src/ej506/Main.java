package ej506;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Measurement> medidas = crearMedidasEjemplo();
		System.out.println("Set antes: " + medidas);

		Scanner teclado = new Scanner(System.in);
		System.out.print("Límite inferior: ");
		float minimo = teclado.nextFloat();
		System.out.print("Límite superior: ");
		float maximo = teclado.nextFloat();
		teclado.close();

		eliminarEnRango(medidas, minimo, maximo);
		System.out.println("Set después: " + medidas);
	}

	private static void eliminarEnRango(Set<Measurement> medidas, float minimo, float maximo) {
		Iterator<Measurement> it = medidas.iterator();
		while (it.hasNext()) {
			Measurement medida = it.next();
			if (contieneEnRango(medida, minimo, maximo)) {
				it.remove();
			}
		}
	}

	private static boolean contieneEnRango(Measurement medida, float minimo, float maximo) {
		for (float valor : medida.getValores()) {
			if (valor >= minimo && valor <= maximo) {
				return true;
			}
		}
		return false;
	}

	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();
		medidas.add(new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)));
		medidas.add(new Measurement(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f)));
		medidas.add(new Measurement(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f)));
		return medidas;
	}
}
