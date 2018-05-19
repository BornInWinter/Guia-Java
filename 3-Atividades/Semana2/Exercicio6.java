public class Exercicio6 {

	public static int rev(int num) {

		if ((num / 1000) > 0) 
			return -1;

		return ((num % 10) * 100) + (((num % 100) / 10) * 10) + ((num % 1000) / 100);

	}

	public static void main(String[] args) {

		System.out.println(rev(321));

	}

}
