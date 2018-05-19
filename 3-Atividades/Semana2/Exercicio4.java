import java.lang.Math;

public class Exercicio4 {

	public static String bhaskara(double a, double b, double c) {

		String msg = "";

		if (a == 0 && b != 0 && c != 0) {

			return "A equação dada tem o termo do segundo grau nulo, haverá apenas uma raiz: " + (- c / b);

		} else if (a != 0 && b == 0 && c != 0) {

			return "Com b = 0 haverá apenas uma raíz: " + Math.sqrt(c / a);

		} else if (a != 0 && b != 0 && c == 0) {

			return "Com c = 0 uma das raízes será 0, e a outra: " + - b / a;

		} else if (a == 0 && b == 0 && c != 0) {

			return "Como a e b são 0 não há como calcular x";

		} else if (a == 0 && b == 0 && c == 0) {

			return "Tanto a quanto b e c são zero, não como calcular x";

		} else if ((Math.pow(b, 2) - 4 * a * c) == 0) {

			return "Com o delta sendo igual a 0 as raízes serão iguais: " + - b / (2 * a);

		} else if ((Math.pow(b, 2) - 4 * a * c) < 0) {

			return "Delta é um número negativo, não há raízes reais";

		} else {

			double raiz = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

			double raiz1 = (- b + raiz) / (2 * a);
			double raiz2 = (- b - raiz) / (2 * a);

			return "Raíz 1: " + raiz1 + "\nRaíz 2: " + raiz2;

		}

	}

	public static void main(String[] args) {

		System.out.println(bhaskara(0, 0, 0));

	}

}
