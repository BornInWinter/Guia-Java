import classes.a1;
import classes.Simples;
import classes.Esfera;
import classes.Complexo;

public class Apoio1 {

	public static int[] high(int[][] matrix) {

		int[] indexes = new int[2];

		// Usando um valor qualquer da matriz
		int highest = matrix[0][0];
		int i, j = 0;

		for (i = 0; i <  matrix.length; i++) {
		
			for (j = 0; j < matrix[i].length; j++) {
				  
				 if (highest < matrix[i][j]) {
				 
				 	highest = matrix[i][j];

					indexes[0] = i;
					indexes[1] = j;
				 
				 }
			
			}
		
		}

		System.out.println("O maior valor é: " + highest);

		return indexes;
	
	}

	// Para este método funcionar a matrix deve ser quadrada
	public static int secondarySum(int[][] matrix) {
	
		int sum = 0;

		/* Equivalente a:
		 *
		 * for (int i = 0; i < matrix.length; i++) {
		 *
		 * 	sum = sum + matrix[i][matrix.length - 1 - i];
		 *
		 * }
		 */
		for (int i = 0; i < matrix.length; i++) sum += matrix[i][matrix.length - 1 - i];

		return sum;

	}

	// As matrizes devem conter dimensões iguais
	public static int[][] matrixSum(int[][] matrix, int[][] xirtam) {
	
		int[][] msum = new int[matrix.length][matrix[0].length];

		/* Equivalente a:
		 *
		 * for (int i = 0; i < matrix.length; i++) {
		 *
		 *	for (int j = 0; j < matrix[i].length; j++) {
		 *	
		 *		msum[i][j] = matrix[i][j] + xirtam[i][j];
		 *	
		 *	}
		 *
		 * }
		 */
		for (int i = 0; i < matrix.length; i++) for (int j = 0; j < matrix[i].length; j++) msum[i][j] = matrix[i][j] + xirtam[i][j];

		return msum;

	}

	public static boolean matrixSim(int[][] matrix) {
	
		/* Equivalente a:
		 *
		 * for (int i = 0; i < matrix.length; i++) {
		 *
		 *	if (matrix[i].length != matrix.length) {
		 *		
		 *		return false;
		 *
		 *	}
		 *
		 * }
		 */
		for (int i = 0; i < matrix.length; i++) if (matrix[i].length != matrix.length) return false;

		return true;

	}

	public static int sales(double[][] semester) {
	
		int msales = -1;
		double max = 0;

		for (int i = 0; i < semester.length; i++) {
		
			double sum = 0;

			for (double d : semester[i]) sum += d;
		 
			if (sum > max) {
			 	
			 	max = sum;
			 	msales = i;

			}

		}

		return msales;
	
	}

	public static void main(String[] args) {

		/*	    0  1  2
		 *	  ___________ 
		 *	0 | 7  8  9 |
		 *	1 | 3  4  5 |
		 *	2 | 0  1  2 |
		 */
		int[][] mat = { { 7, 8, 9 }, { 3, 4, 5 }, { 0, 1, 2 } };

		/*	    0  1  2
		 *	  ___________ 
		 *	0 | 0  1  2 |
		 *	1 | 3  4  5 |
		 *	2 | 7  8  9 |
		 */
		int[][] tam = { { 0, 1, 2 }, { 3, 4, 5 }, { 7, 8, 9 } };

		int[] ind = high(mat);

		System.out.println("E petence a: " + ind[0] + " " + ind[1]);

		System.out.println("A soma da segunda diagonal é: " + secondarySum(mat));

		int[][] mattam = matrixSum(mat, tam);

		System.out.println("A soma das matrizes é: ");

		for (int[] i : mattam) {
		
			for (int j : i) System.out.print(j + " ");

			System.out.println("");

		}

		System.out.println("A matriz é simétrica? " + matrixSim(mat));

		double[][] sem = { { 20000.00, 35000.00, 2000.20, 20832.00, 10500.00, 12000.00 }, { 15453.00, 5300.00, 42000.00, 135832.00, 18580.36, 85200.00 }, { 14320.00, 55800.00, 12356.00, 2563.00, 100000.00, 62325.00 }, { 12345.00, 44823.00, 15863.00, 56483.55, 93000.00, 4852.33 } };

		System.out.println("A empresa que mais vendeu foi a empresa: " + sales(sem));

		new a1();
		new a1();
		new a1();
		new a1();

		Simples s = new Simples();
		
		int[] as = new int[2];
		s.inicializaArray(as, 5);

		System.out.println("O valor 5 está no array? " + s.estaNoArray(as, 5));

		Esfera e = new Esfera(5.0);

		System.out.println("A área da esfera é: " + e.area() + ", e o volume: " + e.volume());

		Complexo x = new Complexo(5, 2);
		Complexo y = new Complexo(1, 3);

		System.out.println("A some de " + x.toString() + " e " + y.toString() + " é: " + Complexo.sum(x, y));
		System.out.println("A subtração de " + x.toString() + " e " + y.toString() + " é: " + Complexo.sub(x, y));

	}

}
