public class Avaliacao {

	public static double forPow(double x, int y) {
	
		if (y == 0) return 1.0;

		double z = 1;
		for (int i = 0; i < y; i++) z *= x;
		return z;
	
	}

	/* Para valores maiores que 20 use Biginteger ao invés de long */
	public static long fat(long x) {
	
		if (x == 0) return 1;

		long f = 1;
		for (int i = 1; i <= x; i++) f *= i;
		return f;
	
	}

/* Equivalente:
 *
 * static double valor(double x, double[] coef) {
 *
 *	double resp = 0;
 *
 *	for (int i = 0; i < coef; i++)
 *		resp += coef[i] * eleva(x, i);
 *
 *	return resp;
 *
 * }
 *
 */

	public static double pol(double x, double[] y) {
	
		double z = 0.0;
		for (int i = 0; i < y.length; i++) z += y[i] * forPow(x, i);
		return z;

	}

/* Código para formar um array de doubles
 *
 * double[] d = new double[10];
 *
 * for (int i = 0; i < 10; i++) {
 *
 *	d[i] = i;
 *	System.out.println("O vetor de double na posição " + i + " é: " + d[i]);
 *
 * }
 *
 */

	public static void main(String[] args) {

		double[] polinomio = { 1.0, 2.0, 3.0, 4.0 };
		System.out.println(pol(20.0, polinomio));

	}

}
