import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero, sucessor;

        System.out.println("Olá, esreva o seu numero: ");
        numero = scan.nextInt();

        sucessor = numero + 1;
        System.out.println("O Sucessor do seu numero é: " + sucessor);
    }
}
