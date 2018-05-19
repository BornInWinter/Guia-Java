// Pergunta 1 	E
// Pergunta 2	C
// Pergunta 3	C
// Pergunta 4	E

public class Avaliacao {

	public static double convert(int conv, double temp) {

		switch (conv) {

			case 1 :
				return ((temp - 32) / 9) * 5;

			case 2 :
				return ((temp / 5) * 9) + 32;

			case 3 :
				return temp + 273;

			case 4 :
				return temp - 273;

			case 5 :
				return (((temp - 32) / 9) * 5) + 273;

			case 6 :
				return (((temp - 273) / 5) * 9) + 32;

			default :				
				return Double.NaN;

		}

	}

	public static void main(String[] args) {

		System.out.println(convert(4, 10));

	}

}

/* Método mais avançado
import java.util.Scanner;
import java.util.InputMismatchException;

public class Avaliacao {

	static Scanner scan = new Scanner(System.in);

	public static double getInput() {
	
		try {
		
			System.out.println("Qual conversão deseja realizar?\n1 Celsius para Fahrenheit\t2 Fahrenheit para Celsius\n3 Celsius para Kelvin\t\t4 Kelvin para Celsius\n5 Kelvin para Fahrenheit\t6 Fahrenheit para Kelvin");
			int conv = scan.nextInt();

			System.out.print("\nQual o valor da temperatura? ");
			double temp = scan.nextDouble();

			return convert(conv, temp);

		} catch(InputMismatchException exp) {

			System.err.println("\nVocê não deve usar caracteres ou pontos isolados\n");
			scan.next();

			return getInput();

		}

		
	}	

	public static double convert(int conv, double temp) {

		switch (conv) {

			case 1 :
				return ((temp - 32) / 9) * 5;

			case 2 :
				return ((temp / 5) * 9) + 32;

			case 3 :
				return temp + 273;

			case 4 :
				return temp - 273;

			case 5 :
				return (((temp - 32) / 9) * 5) + 273;

			case 6 :
				return (((temp - 273) / 5) * 9) + 32;

			default :
				System.err.println("\nEscolha um valor dentre 1-6 correspondendo com a conversão desejada\n");
				getInput();
				
				return -1;

		}

	}

	public static void main(String[] args) {

		System.out.println(getInput());
		
	}

} */

/* Código da pergunta 4
public class Avaliacao {

	public static boolean primo(int n) {

		int div = 2;

		while (n > div) {

			if (n % div == 0) return false;

			div++;

		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(primo(50));				

	}

} */
