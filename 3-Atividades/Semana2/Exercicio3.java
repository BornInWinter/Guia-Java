import java.lang.Math;

public class Exercicio3 {

	public static double fallTime(double h) {

		return Math.sqrt(2 * h / 9.8);

	}

	public static void main(String[] args) {

		System.out.println(fallTime(10));

	}

}
