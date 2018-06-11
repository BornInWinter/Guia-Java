package classes;

public class Pessoa2 {

	public String nome;
	public int idade, dia, mes, ano;
	public Pessoa2 conjuge;

	public Pessoa2(String nome, int idadeEmAnos) {
	
		this.nome = nome;
		idade = idadeEmAnos;
		conjuge = null;

	}

	public Pessoa2(String nome, int idade, Pessoa2 conjuge) {
	
		this(nome, idade);
		this.conjuge = conjuge;

	}

	public Pessoa2(String nome, int idade, int dia, int mes, int ano) {
	
		this(nome, idade);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

}
