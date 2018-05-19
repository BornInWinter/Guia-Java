import java.util.Arrays;

public class Exercicio3 {

	public static int mediana(int v1, int v2, int v3) {

		int[] v = {v1, v2 ,v3};
		Arrays.sort(v);

		return v[1];

	}

	public static void main(String[] args) {

		System.out.println(mediana(256, 986, 154));
	
	}

}
