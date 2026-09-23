package ej506;

import java.util.ArrayList;
import java.util.List;

public class Measurement {

	private List<Float> valores;

	public Measurement(List<Float> valores) {
		this.valores = new ArrayList<>(valores);
	}

	public List<Float> getValores() {
		return List.copyOf(valores);
	}

	public String toString() {
		return valores.toString();
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Measurement)) {
			return false;
		}
		return valores.equals(((Measurement) obj).valores);
	}

	public int hashCode() {
		return valores.hashCode();
	}
}
