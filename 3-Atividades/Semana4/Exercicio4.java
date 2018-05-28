public class Exercicio4 {

	public static void main(String[] args) {
	
		int horz = 80;
		int vert = 20;

		String reta = "";
		for (int i = 0; i < horz; i++) reta += "*";

		System.out.println(reta);

		String ater = "*";
		for (int j = 0; j < horz - 2; j++) ater += " ";
		ater += "*";

		for (int i = 0; i < vert; i++) {
		
			System.out.println(ater);
		}

		System.out.println(reta);

	}

}
