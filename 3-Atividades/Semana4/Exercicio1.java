/*
 * a) Oi
 *    Oi
 *    Oi
 *    Oi
 *    Oi
 *
 * b) OiOiOiOiOi
 *
 * c) OiProgramadorOiProgramadorOiProgramador
 *
 * d) **********
 *    *        *
 *    *        *
 *    *        *
 *    **********
 *
 */

public class Exercicio1 {

	public static void horiz() {
	
		for (int comp = 1; comp < 11; comp++)
			System.out.print("*");
		System.out.println();

	}

	public static void lado() {
	
		System.out.print("*");

		for (int espaco = 1; espaco <= 8; espaco++)
			System.out.print(" ");
		System.out.println("*");
	
	}

	public static void main(String[] args) {
	
		System.out.println("Questão a)");

		for (int cont = 1; cont <= 5; cont++) {

			System.out.println("Oi");

		}

		System.out.println("\nQuestão b)");

		for (int cont = 1; cont <= 5; cont++) {

			System.out.print("Oi");

		}

		System.out.println("\n\nQuestão c)");

		for (int cont = 1; cont <= 3; cont++) {

			System.out.print("Oi");
			System.out.print("Programador");
		
		}

		System.out.println("\n\nQuestão d)");

		horiz();
		for (int vert = 1; vert < 4; vert++) lado();
		horiz();

	}

}
