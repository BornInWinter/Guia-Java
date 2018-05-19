// Ao receber o valor 10 o método irá imprimir:
//
// 	Imprimindo sequência iniciando em 10
// 	5
// 	16
// 	8
// 	4
// 	2
// 	1

public class Exercicio4 {

	public static void conjecturaDeCollatz(int n) {

		System.out.println("Imprimindo sequência iniciando em: " + n);

		while (n > 1) {

			if (n % 2 == 0) n = n / 2;
			else n = 3 * n + 1;

			System.out.println(n);

		}

	}

	public static void main(String[] args) {

		conjecturaDeCollatz(10);

	}

}
