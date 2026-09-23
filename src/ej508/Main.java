package ej508;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Measurement> medidas = crearMedidasEjemplo();
		System.out.println("Antes: " + medidas);

		Set<Measurement> limpias = new HashSet<>();
		for (Measurement medida : medidas) {
			limpias.add(sinDuplicados(medida));
		}

		System.out.println("Después: " + limpias);
	}

	private static Measurement sinDuplicados(Measurement medida) {
		List<Float> valores = medida.getValores();
		return new Measurement(new ArrayList<>(new LinkedHashSet<>(valores)));
	}

	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(1.0f, 2.5f, 1.0f, 4.25f))));
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(5.5f, 5.5f, 5.5f, 5.5f))));
		medidas.add(new Measurement(new ArrayList<>(Arrays.asList(2.0f, 3.0f, 4.0f, 5.0f))));
		return medidas;
	}
}
