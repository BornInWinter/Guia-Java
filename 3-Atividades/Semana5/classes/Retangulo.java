package classes;

public class Retangulo {

	double comprimento, altura;

	public Retangulo(double c, double a) {
	
		comprimento = c;
		altura = a;
	
	}

	public double area() {
	
		return altura * comprimento;
	
	}

	public double perimetro() {
	
		return altura * 2 + comprimento * 2;
	
	}

}
