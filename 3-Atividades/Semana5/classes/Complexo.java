package classes;

public class Complexo {

	int real, imaginary;

	public Complexo(int r, int i) {
	
		real = r;
		imaginary = i;

	}

	public static String sum(Complexo x, Complexo y) {
	
		int rSum = x.real + y.real;
		int iSum = x.imaginary + y.imaginary;

		return new Complexo(rSum, iSum).toString();

	}

	public static String sub(Complexo x, Complexo y) {
	
		int rSub = x.real - y.real;
		int iSub = x.imaginary - y.imaginary;

		return new Complexo(rSub, iSub).toString();
	
	}

	public String toString() {

		// Leia 4-Extras/2-Condição Ternária
		return real + ((imaginary > 0) ? " + " : " - ") + ((imaginary > 0) ? imaginary : -1 * imaginary) + 'i';

	}

}
