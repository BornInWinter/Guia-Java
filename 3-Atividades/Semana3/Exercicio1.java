public class Exercicio1 {

	public static String cor(int identificador) {

		switch (identificador) {

			case 1 :
				return "verde";

			case 2 :
				return "amarelo";

			case 3 :
				return "azul";

			case 4 :
				return "branco";

			default:
				return "Identificador inválido";

		}

	}

	public static void main(String[] args) {

		System.out.println(cor(1));

	}

}
