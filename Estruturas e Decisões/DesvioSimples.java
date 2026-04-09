import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade em estoque: ")
        int quantidade = scanner.nextInt();

        if (quantidade < 5) {
            System.out.println("AVISO: O estoque deste produto está baixo!");
        }

        scanner.close();
    }
}