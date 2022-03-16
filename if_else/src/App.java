import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Massa, pode dirigir ^^");
        }

        else {
            System.out.println("Cara, foi mal, mas tu não pode dirigir!");
        }
    }
}
