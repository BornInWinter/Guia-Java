public class Retangulo {

	public double comprimento, altura;

	public Retangulo(double comprimento, double altura) {

		this.comprimento = comprimento;
		this.altura = altura;
	
	}

	public double area() {
	
		return comprimento * altura;
	
	}

	public double perimetro() {
	
		return 2 * comprimento + 2 * altura;
	
	}

	public static int busca(Retangulo[] ra, double comprimento) {
	
		for (int i = 0; i < ra.length; i++) if (ra[i].comprimento >= comprimento) return i;

		return -1;
	
	}

	public static int buscaBin(Retangulo[] ra, double comprimento) {
	
		int i = 0;
		int f = ra.length - 1;

		while (i <= f) {
		
			int m = (i + f) / 2;

			if (ra[m].comprimento == comprimento) {
			
				return m;

			} else if (ra[m].comprimento > comprimento) {
			
				f = m - 1;
			
			} else if (ra[m].comprimento < comprimento) {
			
				i = m + 1;
			
			}
		
		}

		return -1;
	
	}

}
