import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 7;
        int palpite = 0;

        while (palpite != numeroSecreto) {
            System.out.print("Adivinhe o número: ");
            palpite = sc.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior!");
            }
        }

        System.out.println("Parabéns! Você acertou!");
    }
}