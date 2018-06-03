package classes;

public class a1 {

	static int i = 0;

	String[] calls = { "Você me chamou, como posso ajudar?", "Me chamou denovo, o que é?", "O QUE É P*RRA???" };

	public a1() {
	
		System.out.println(calls[i]);

		/* Equivalente a:
		 *
		 * if (i >= 2) {
		 *
		 *	i = 0;
		 *
		 * } else {
		 *
		 *	i++;
		 *
		 * }
		 */
		i = (i >= 2) ? 0 : i + 1;

	}

}
