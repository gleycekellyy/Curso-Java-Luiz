import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

       double numero1, numero2, total;

       System.out.println("Seja bem vindo :D");
       System.out.println("please, coloca teu primeiro número:");
       numero1 = scan.nextDouble();
       System.out.println("please, coloca teu segundo número:");
       numero2 = scan.nextDouble();

       total = numero1 + numero2;

       System.out.println("tudinho fica por:" + total);
       System.out.println("Thank you :)");
    }
}