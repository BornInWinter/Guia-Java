public class Exercicio2 {

    public static float rtod(float real, float tax) {

        return real/tax;

    }

    public static void main(String[] args) {
    
        System.out.println(rtod(1.5F, 3F));
    
    }

}


/* Método mais avançado
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio2 {

    public static float rtod(float real, float tax) {

        return real/tax;

    }
    
    public static void getInput() {

	Scanner scan = new Scanner(System.in);

        try {
        
            System.out.print("\nColoque o valor em real: ");
            float real = scan.nextFloat();

            System.out.print("Coloque o valor comercial do dollar: ");
            float tax = scan.nextFloat();

            System.out.println(rtod(real, tax));
        
        } catch(InputMismatchException exc) {
        
            System.err.println("\nO valor deve ser um float!");
            scan.next();
            
            getInput();

        }
            
    }
    
    public static boolean stob(String res) {
    
        if (res.equals("sim") || res.equals("s")) {
        
            return true;
        
        } else if (res.equals("nao") || res.equals("não") || res.equals("n")) {
        
            return false;
        
        } else {
        
            System.out.println("\nO que você digitou é incompreensível, vou até parar por aqui.");
            return false;
        
        }
    
    }

    public static void main(String[] args) {
        
        Boolean conv = true;
        
        while (conv) {
        
            getInput();
 
            System.out.println("\nDeseja realizar outra converção?");
            scan.nextLine();
            conv = stob(scan.nextLine());
 
        }
  
    }

} */
