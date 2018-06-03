public class Apoio2 {

	public static int contaCaracteres(char[][] palavras) {
	
		int n = 0;

		// Para cada array em palavras some seu tamanho a n
		for (char[] chars : palavras) n += chars.length;

		return n;

	}

	public static int contaLetra(char[][] palavras, char letra) {
	
		int n = 0;

		/* Equivalente a:
		 *
		 * for (int i = 0; i < palavras.length; i++) {
		 *
		 *	for (int j = 0; j < palavras[i].length; j++) {
		 *
		 * 		if (c == letra) {
		 *
		 * 			n = n + 1;
		 *
		 * 		}
		 *
		 *	}
		 *
		 * }
		 */
		for (char[] chars : palavras) for (char c : chars) if (c == letra) n++;
	
		return n;

	}

	public static void avaliaMatriz(double[][] matriz) {
	
		double h = matriz[0][0];
		double l = matriz[0][0];
		double m = 0.0;
		
		int e = 0;

		for (double[] doub : matriz) {
		
			e += doub.length;

			for (double b : doub) {
			
				m += b;
				
				h = (b > h) ? b : h;
				l = (b < l) ? b : l;
			
			}
		
		}

		System.out.println("A média é: " + (m / e) + "\nO maior elemento é: " + h + "\nO menor elemento é: " + l);

	}

	public static int[][] soma3(int[][] m1, int[][] m2, int[][] m3) {
	
		if (m1.length != m2.length || m1.length != m3.length || m2.length != m3.length) return null;

		int[][] soma = new int[m1.length][m1[0].length];

		for (int i = 0; i < m1.length; i++) {
		
			if (m1[i].length != m2[i].length || m1[i].length != m3[i].length || m2[i].length != m3[i].length) return null;

			for (int j = 0; j < m1[i].length; j++) soma[i][j] = m1[i][j] + m2[i][j] + m3[i][j];
		
		}
	
		return soma;

	}

	public static void main(String[] args) {
	
		char[][] langs = { { 'J', 'A', 'V', 'A' }, { 'K', 'O', 'T', 'L', 'Y', 'N' }, { 'P', 'Y', 'T', 'H', 'O', 'N' } };

		System.out.println("A matriz langs contém: " + contaCaracteres(langs) + " caracteres");
	
		System.out.println("A matriz langs repete o caractere A: " + contaLetra(langs, 'A') + " vezes");

		double[][] nums = { { 59.8, 574.09, 874.8 }, { 1.5, 555.0, 5.69 }, { 79.8, 154.72, 62.99 } };

		avaliaMatriz(nums);

		int[][] int1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] int2 = { { 4, 5, 6 }, { 7, 8, 9 }, { 1, 2, 3 } };
		int[][] int3 = { { 7, 8, 9 }, { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] int6 = soma3(int1, int2, int3);

		System.out.println("A soma das matrizes int1, int2 e int3 é: ");

		for (int[] i : int6) { 
		
			for (int j : i) System.out.print(j + " ");

			System.out.println("");

		}

	}

}
