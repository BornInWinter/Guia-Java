public class Exercicio6 {

	public static float maior(float[] fa) {

		float m = 0.0f;
		for (float f : fa) m = m < f ? f : m;
		return m;
	
	}

	public static void main(String[] args) {
	
		float[] fa = { 0.5f, 0.88f, 78.2f, 7.9f, 0.002f };
		System.out.println(maior(fa));
	
	}

}
