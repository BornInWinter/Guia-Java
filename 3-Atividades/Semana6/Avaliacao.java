/* Respostas:
 *
 * Exercício 1
 *
 * 	O método construtor não precisa possuir o mesmo nome da classe...
 * 	> Falso, o construtor precisa ter o mesmo nome da classe
 *
 *	O construtor nunca terá um tipo de retorno, podendo ser do tipo
 *	private, public, protected ou default.
 *	> Correto
 *
 *	Os construtores podem ser marcados como final. static ou abstract
 *	> Falso, eles não podem
 *
 *	Classes em java não possuem construtor padrão e por isso deve ser 
 *	criado.
 *	> Falso, há um construtor padrão
 *
 *	Todas as classes em Java devem possuir pelo menos um construtor,
 *	exceto as classes abstratas
 *	> Falso, possuir um construtor é necessário para toda a classe.
 *
 * Exercício 2:
 *
 * 	Erros encontrados:
 * 	- Não contém tipo de retorno (int)
 * 	- Retorna 1 ao invés de -1 caso não encontre
 * 	- Não recebe um array de retângulos
 * 	- Procura pelo menor ou igual, em outras palavras, que seja igual
 * 					    ou não contenha o comprimento
 *
 * Exercício 3:
 *
 * 	A busca binária é um eficiente algorítmo para encontrar um item
 * 	em uma lista não ordenada.
 * 	> Falso a busca binária só irá funcionar corretamente se a lista
 * 	estiver ordenada
 *
 * 	Na busca binária não há uma padronização dos elementos da lista:
 * 	os da esquerda podem ser maiores que os da direita em uma lista
 * 	crescente...
 * 	> Falso, em uma lista crescente os elementos da esquerda devem
 * 	ser menores do que os da direita, não porque o algorítmo de
 * 	busca binária exige mas porque é assim que algo crescente é
 * 	ordenado, dos menores para os maiores.
 *
 * 	Na busca binária precisa-se dividir a lista na metade e isso deve
 * 	ser feito em Java da seguinte forma: "meio=(esquerda+direita)/3"...
 * 	> Falso, deve ser dividido por 2
 *
 * 	Quando não é encontrado o valor que se procura na busca binária,
 * 	o código entra em loope não mostra erro de execução.
 * 	> Falso, a não ser que o programador programe dessa forma, o que
 * 	é muito improvável
 *
 * 	A busca binária funciona dividindo repetidamente pela metade a 
 * 	porção da lista que deve conter o item, até reduzir as localizações 
 * 	possíveis a apenas uma.
 * 	> Correto
 *
 * Exercício 4:
 *
 * 	Erros encontrados:
 * 	- Recebendo o comprimento como int ao invés de double
 * 	- Não dividindo a variável meio por 2
 * 	- Retornando -1 caso encontrar e retornando meio caso não encontrar
 * 	- Retornando double ao invés de int
 */
import classes.Retangulo;

public Avaliacao {

	public static void main(String[] args) {
	
		// O objeto Retangulo não foi testado
	
	}

}
