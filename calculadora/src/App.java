import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner gk = new Scanner(System.in);
        double num1;
        double num2;
        double total;

        System.out.println("Seja bem vindo :D");
        System.out.println("Digite o primeiro valor:");
        num1 = gk.nextDouble();
        System.out.println("Digite o segundo valor:");
        num2 = gk.nextDouble();
        total = num1 + num2;
        System.out.println("Seu valor é: " + total);
        System.out.println("Valeu!");
  }
}
