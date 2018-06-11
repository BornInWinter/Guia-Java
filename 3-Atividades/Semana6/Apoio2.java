import classes.Pessoa2;

public class Apoio2 {

	// Exercício 1
	public static boolean comparaTextos(String texto1, char[] texto2) {
	
		if (texto1.length() != texto2.length) return false;

		char[] t2c = texto1.toCharArray();

		/* Equivalente a:
		 *
		 * for (int i = 0; i < t2c.length; i++) {
		 *	
		 *	if (t2c[i] != texto2[i]) {
		 *
		 * 		return false;
		 *
		 *	}
		 *
		 * }
		 */
		for (int i = 0; i < t2c.length; i++) if (t2c[i] != texto2[i]) return false;
	
		return true;

	}

	// Exercício 3
	public static Pessoa2 buscaPessoa(Pessoa2[] pessoas, String nome, int idade) {
	
		/* Equivalente a:
		 *
		 * for (int i = 0; i < pessoas.length; i++) {
		 *
		 *	if (p2.nome.equals(nome) && p2.idade == idade) {
		 *
		 * 		return p2;
		 *
		 *	}
		 *
		 * }
		 */
		for (Pessoa2 p2 : pessoas) if (p2.nome.equals(nome) && p2.idade == idade) return p2;

		return null;

	}

	// Exercicio 4
	public static void ordenaPessoas(Pessoa2[] pessoas) {
	
		for (int i = pessoas.length - 1; i > 0; i--) {
		
			for (int j = 0; j < i; j++) {
			
				if (pessoas[j].ano > pessoas[j + 1].ano) {
				
					Pessoa2 a = pessoas[j + 1];

					pessoas[j + 1] = pessoas[j];
					pessoas[j] = a;

				} else if (pessoas[j].ano == pessoas[j + 1].ano) {
				
					if (pessoas[j].mes > pessoas[j + 1].mes) {
					
						Pessoa2 a = pessoas[j + 1];

						pessoas[j + 1] = pessoas[j];
						pessoas[j] = a;

					} else if (pessoas[j].mes == pessoas[j + 1].mes) {
					
						if (pessoas[j].dia > pessoas[j + 1].dia) {
					
							Pessoa2 a = pessoas[j + 1];

							pessoas[j + 1] = pessoas[j];
							pessoas[j] = a;

						}
					
					}
				
				}
			
			}

		}
	
	}

	// Cria uma String com um array de Pessoa2
	public static String pArray(Pessoa2[] pessoas) {
	
		String s = "[ Início do array de pessoas\n";

		for (Pessoa2 p : pessoas) s += "\tNome: " +  p.nome + " Nascimento: " + p.dia + "/" + p.mes + "/" + p.ano + "\n";

		s += "Fim do array de pessoas ]";

		return s;
	
	}

	public static void main(String[] args) {
	
		System.out.println(comparaTextos("Caqui é bom", new char[] { 'C', 'a', 'q', 'u', 'i', ' ', 'é', ' ', 'b', 'o', 'm' }));

		// Exercício 2 (classes/Pessoa2)
		Pessoa2 p2 = new Pessoa2("Humano", 15, new Pessoa2("Onamuh", 51));

		Pessoa2 p = buscaPessoa(new Pessoa2[] { new Pessoa2("A", 1), new Pessoa2("B", 2), new Pessoa2("C", 3) }, "B", 2);

		System.out.println(p.nome + " " + p.idade);

		Pessoa2[] p2a = { new Pessoa2("A", 1, 1, 1, 2001), new Pessoa2("B", 2, 20, 12, 1875), new Pessoa2("C", 3, 9, 5, 1333), new Pessoa2("D", 4, 1, 1, 2001) };
		ordenaPessoas(p2a);

		System.out.println(pArray(p2a));

	}

}
