public class Exercicio8 {

	public static double media(double[] notas) {
	
		int m = 0;
		int n = 0;

		double sum = 0;

		for (int i = 0; i < notas.length; i++) {
		
			m = notas[m] < notas[i] ? i : m;
			n = notas[n] < notas[i] ? n : i;
		
			sum += notas[i];

		}

		return (sum - notas[m] - notas[n]) / 4;

	}

	public static void main(String[] args) {
	
		double[] notas = { 6.0, 7.8, 6.6, 5.4, 9.8, 1.5 };
		System.out.println(media(notas));

	}

}
