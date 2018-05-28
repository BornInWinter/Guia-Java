import java.util.Arrays;
import java.lang.Math;

public class Exercicio9 {

	public static double[] dsum(double[] d1, double[] d2) {
	
		if (d1.length != d2.length) System.exit(1);

		double[] d3 = new double[d1.length];
		for (int i = 0; i < d3.length; i++) d3[i] = d1[i] + d2[i];

		return d3;

	}

	public static double[] psum(double[] p, double n) {
	
		double[] r = new double[p.length];

		for (int i = 0; i < r.length; i++) r[i] = p[i] * Math.pow(n, i);
		return r;
	
	}

	public static void main(String[] args) {

		double[] arr = { 1.5, 55.0, 8.9, 1.7 };
		double[] rra = { 1.7, 8.9, 55.0, 1.5 };
		System.out.println(Arrays.toString(dsum(psum(arr, 2), psum(rra, 0.5))));
	
	}

}
