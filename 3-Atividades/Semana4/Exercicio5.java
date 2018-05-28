public class Exercicio5 {

	public static void forM(int n) {
	
		for (int i = 0; i < n; i++) {
		
			System.out.print("*");
		
		}

		System.out.println("");

	}

	public static void whileM(int n) {
	
		String s = "";

		while (s.length() != n) {
		
			s += "*";

		}

		System.out.println(s);
	
	}

	public static void dowhileM(int n) {
	
		String s = "";

		do {

			s += "*";

		} while (s.length() != n);

		System.out.println(s);
	
	}

	public static void main(String[] args) {
	
		int n = 80;

		System.out.println("Método com for:");
		forM(n);

		System.out.println("\nMétodo com while:");
		whileM(n);

		System.out.println("\nMétodo com do-while:");
		dowhileM(n);

	}

}
