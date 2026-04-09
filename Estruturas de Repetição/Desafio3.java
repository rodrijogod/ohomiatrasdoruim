import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / 5;

        System.out.println("Média final: " + media);
    }
}