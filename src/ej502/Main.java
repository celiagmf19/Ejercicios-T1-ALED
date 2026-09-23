package ej502;

public class Main {

	public static void main(String[] args) {
		Measurements m1 = new Measurements(new float[] { 1.0f, 2.5f, 3.0f, 4.25f });
		Measurements m2 = new Measurements(new float[] { -1.5f, 0.0f, 10.0f, 5.5f });

		System.out.println(m1);
		System.out.println(m2);
	}
}
