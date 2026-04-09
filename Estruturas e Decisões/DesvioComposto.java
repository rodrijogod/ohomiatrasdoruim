import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Digite a wquantidade em estoque: ");
        int quantidade = scanner.nextInt();

        if (quantidade < 5) {
            System.out.println("AVISO: O estoque deste produto está baixo!");
        }else{
            System.out.println("Estoque OK.");
        }

        scanner.close();
    }
}