package classes;

public class Simples {

	public void inicializaArray(int[] a, int v) {
	
		// Para cada elemento i em a faça: i = v;
		for (int i = 0; i < a.length; i++) a[i] = v;

	}

	public boolean estaNoArray(int[] a, int v) {
	
		// Para cada elemento i em a verifique se i == v, se sim retorne true
		for (int i : a) if (i == v) return true;

		return false;
	
	}

}
