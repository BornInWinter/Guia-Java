public class Exercicio7 {

	public static int maior(float[] fa) {
	
		int m = 0;
		for (int i = 0; i < fa.length; i++) m = fa[m] < fa[i] ? i : m;
		return m;


	}
	
	public static void main(String[] args) {
	
		float[] fa = { 15.9f, 5.7f, 0.3f, 557.0f, 1.0f };
		System.out.println(maior(fa));
	
	}

}
