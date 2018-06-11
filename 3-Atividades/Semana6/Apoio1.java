import java.util.Arrays;

import classes.Pessoa;
import classes.Produto;

public class Apoio1 {

	// Exercício 2 	
	public static boolean polindromo(String s) {
	
		char[] c = s.toLowerCase().toCharArray();

		for (int i = 0; i < c.length / 2; i++) {
		
			/* Equivalente a:
			 *
			 * if (c[i] == c[c.length - 1 - i]) {
			 *	return false;
			 * }
			 */
			if (c[i] != c[c.length - 1 - i]) return false;
		
		}

		return true;
	
	}

	// Exercício 3
	public static String copy(String s) {
	
		return new String(s);
	
	}

	// Exercício 4
	public static boolean binSearch(int[] a, int b) {

		int i = 0;
		int f = a.length - 1;

		while (i <= f) {
		
			int m = (i + f) / 2;

			if (a[m] == b) {
			
				return true;

			} else if (a[m] < b) { 
			
				i = m + 1;

			} else if (a[m] > b) {

				f = m - 1;

			}

		}

		return false;
	
	}

	// Exercício 5
	public static void lex(String[] sa) {

		for (int i = sa.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (sa[j].compareTo(sa[j + 1]) > 0) {
				
					String l = sa[j];

					sa[j] = sa[j + 1];
					sa[j + 1] = l;

				}
			
			}
		
		}

	}

	// Exercício 6
	public static void ordProd(Produto[] pa) {
	
		for (int i = pa.length - 1; i > 0; i--) {
		
			for (int j = 0; j < i; j++) {
			
				if (pa[j].produto > pa[j + 1].produto) {
				
					Produto p = pa[j + 1];

					pa[j + 1] = pa[j];
					pa[j] = p;
				
				}
			
			}
		
		}
	
	}

	// Cria uma String com os valores de um array de produtos
	public static String printProdArr(Produto[] pa) {
	
		String s = "[ ";

		for (Produto p : pa) {
		
			s += p.produto + ", ";
		
		}

		 s += "]";

		 return s;
	
	}

	// Exercício 7
	public static int prodArr(Produto[] pa, int code) {
	
		int i = 0;
		int f = pa.length - 1;

		while (i <= f) {
		
			int m = (i + f) / 2;

			if (pa[m].produto == code) {
			
				return m;

			} else if (pa[m].produto < code) {
			
				i = m + 1;
			
			} else if (pa[m].produto > code) {
			
				f = m - 1;
			
			}

		}

		return -1;
	
	}

	// Alguns testes com os métodos e classes dos exercícios
	public static void main(String[] args) {
	
		// Pessoa declarada e definida para o Exercício 1
		Pessoa p = new Pessoa("Humano", "12.345.678-9", '?', 1, 1, 2000);
	
		System.out.println(polindromo("Ovo"));

		int[] arrI = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		System.out.println(binSearch(arrI, 7));

		String[] arrS = { "Zebra", "Yellow", "Nature", "Animal", "Boring", "Newton" };
		lex(arrS);

		System.out.println(Arrays.toString(arrS));

		Produto[] pa = { new Produto(135, 347), new Produto(57, 87), new Produto(524, 5878) };
		ordProd(pa);

		System.out.println(printProdArr(pa));

		System.out.println(prodArr(pa, 135));

	}

}
