import classes.Retangulo;

public class Avaliacao {

	/* Resposta correta da 1
	 *
	 * public static void main(String[] args) {
	 *
	 *	double[][] m = new double[10][10];
	 *
	 * 	for (int i = 0; i < 10 i++) {
	 *
	 *		for (int j = 0; j < 10; j++) {
	 *
	 * 			m[i][j] = Math.random();
	 *
	 *		}
	 *
	 * 	}
	 *
	 * } 
	 *
	 * Motivos para as outras estarem erradas:
	 * 	- Atribuindo 0 a todos os valores da matriz;
	 * 	- Atribuindo Math.random() para os vetores da metriz
	 * 	- Usando if(j<10) ao invés de for(int j=0;j<10;j++)
	 * 	- Não declarando a matriz
	 */
	public static double[][] randomMatrix() {
	
		double[][] random = new double[10][10];

		for (double[] d : random) for (int i = 0; i < d.length; i++) d[i] = Math.random();

		return random;
	
	}


	/* Resposta correta da 2
	 *
	 * static int pares(int[][] m) {
	 *
	 * 	int total = 0;
	 *
	 * 	for (int i = 0; i < m.length; i++) {
	 *
	 * 		for (int j = 0; j < m[0].length; j++) {
	 *
	 * 			if (m[i][j] % 2 == 0) total++; 
	 *
	 * 		}
	 *
	 * 	}
	 *
	 * 	return total;
	 *
	 * }
	 *
	 * Motivos para as outras estarem erradas:
	 * 	- Recebendo inteiro como parâmetro (int m)
	 * 	- Retornando a matriz ao invés do total
	 * 	- Inicializando total com 1
	 * 	- Verificando se é divisível por 1 ao invés de 2
	 */
	public static int pairNumbers(int[][] nums) {
	
		int n = 0;

		for (int[] i : nums) for (int j : i) if (j % 2 == 0) n++;

		return n;
	
	}

	/* Resposta da 3: Um método pode ser acessado utilizando o nome da classe
	 * 		  São vizíveis dentro de toda a class
	 *
	 * 	Ambas estão corretas, porém ambas são marcadas como erradas.
	 * 	Caso um método exija um objeto, podemos criar uma instância avulsa: (new Obj()).Metodo, sendo Obj o nome da classe
	 * 	Como não existem modificadores de acesso a nível de método não há como privá-los de enxergar os outros métodos e atributos
	 * 	Como a pergunta se refere tanto a métodos como atributos achei a resposta: São viziveis dentro de toda a classe, mais
	 * 	correta, porém o sistema corrige como errada, o mesmo vale para a outra resposta.
	 *
	 * Motivos para as outras estarem erradas:
	 * 	- Não há a necessidade de usar static
	 * 	- Não necessariamente visíveis por outras classes
	 * 	- Podem ser static e não necessariamente visíveis apenas pelo objeto da classe
	 */

	/* Resposta da 4
	 *
	 * class Retangulo {
	 *
	 * 	double comprimento;
	 * 	double altura;
	 *
	 * 	Retangulo(double comprimento, double altura) {
	 *
	 * 		this.coprimento = comprimento;
	 * 		this.altura = altura;
	 *
	 * 	}
	 *
	 * 	double area() {
	 *
	 * 		return comprimento * altura;
	 *
	 * 	}
	 *
	 * 	double perimetro() {
	 *
	 * 		return 2 * comprimento + 2 * altura;
	 *
	 * 	}
	 *
	 * }
	 *
	 * Motivos para as outras estarem erradas:
	 * 	- Declarando os atributos como int
	 * 	- Métodos declarados com class
	 * 	- Não usando this no construtor
	 * 	- Perímetro sendo calculado como altura + comprimento
	 */

	public static void main(String[] args) {
	
		for (double[] doub : randomMatrix()) for (double d : doub) System.out.print(d + " ");

		System.out.println("Há " + pairNumbers(new int[][] { { 1, 2 }, { 3, 4 } }) + " números pares na matriz");

		Retangulo r = new Retangulo(2, 4);

		System.out.println(r.area() + " " + r.perimetro());

	}

}
