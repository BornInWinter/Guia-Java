package classes;

public class Esfera {

	double raio = 0;

	public Esfera(double raio) {
	
		// Usando this para indicarmos que estamos nos referindo ao raio da classe
		this.raio = raio;
	
	}

	public double area() {
	
		return 4 * Math.PI * Math.pow(raio, 2);

	}

	public double volume() {
	
		return (4 * Math.PI * Math.pow(raio, 3)) / 3;

	}

}
