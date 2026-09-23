package ej501;

import java.util.Arrays;

public class Measurements {
	
	public float[] valores;
	
	public  Measurements(float[] valores) {
		this.valores = Arrays.copyOf(valores, valores.length);
	}
	
	
	public float[] getValores() {
		return Arrays.copyOf(valores, valores.length);
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Measurements)) {
			return false;
		}
		return Arrays.equals(valores, ((Measurements) obj).valores);
	}
	
	public int hashCode() {
		return Arrays.hashCode(valores);
	}
}
