public class Exercicio2 {

        public static String media(double v1, double v2, double v3, double v4) {

                return (v1 + v2 + v3 + v4) / 4 > 0 ? "Média maior que zero" : "Média menor que zero";

        }

        public static void main(String[] args) {

                System.out.println(media(-6, 1, 1, 0));

        }

}
