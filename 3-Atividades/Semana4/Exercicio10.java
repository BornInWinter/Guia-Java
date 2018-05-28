// Esse programa contém todas as respostas dos exercícios de apoio 2 da semana4

public class Exercicio10 {

	public static int contagem(int[] valores, int x) {

		int y = 0;
	
//		for (int i = 0; i < valores.length; i++) if (valores[i] == x) y++;

		for (int i : valores) y += i == x ? 1 : 0;
		return y;

	}

	public static String contagemMaior(int[] a1, int[] a2) {
	
		int m = 0;
		for (int i = 0; i < a1.length; i++) m = m < a1[i] ? i : m;

		int r = contagem(a2, a1[m]);

		return "O núemero " + a1[m] + " aparece " + r + " vezes no array lav";

	}

	public static void contagemTodos(int[] a1, int[] a2) {
	
		for (int i : a1) System.out.println("O número " + i + " aparece " + contagem(a2, i) + " vezes no array lav");
	
	}

	public static void main(String[] args) {
	
		int[] val = { 1, 2, 3, 4, 1, 2, 3, 4 };
		int[] lav = { 4, 3, 2, 1, 4, 3, 2, 1 };

		contagemTodos(val, lav);

	}

}
