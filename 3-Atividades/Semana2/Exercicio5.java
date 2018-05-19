public class Exercicio5 {

	public static String tax(int team, int player, int yellow, int red) {

		return "Time: " + team + "\nN° do jogador: " + player + "\nCartões Amarelos: " + yellow + "\nCartões Vermelhos: " + red + "\nMulta: " + (((double)yellow * 1000.20) + 
																			 ((double)red * 4523.75));

	}

	public static void main(String[] args) {

		System.out.println(tax(1, 13, 1, 1));

	}

}
