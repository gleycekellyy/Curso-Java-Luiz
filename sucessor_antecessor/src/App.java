import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero, antecessor, sucessor;

        System.out.println("Olá, digite o numero que deseja:");
        numero = scan.nextInt();

        antecessor = numero - 1;
        System.out.println("O antecessor do seu numero é:" + antecessor);

        sucessor = numero + 1;
        System.out.println("O sucessor do teu numero é:" + sucessor);

        System.out.println("Por fim, teu numero é " + numero + " o antecessor dele é " + antecessor
                + " e o sucessor dele é " + sucessor + ".");
    }
}
