import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrizA = new int[15];
        int[] matrizB = new int[15];

        System.out.println("---- Preenchendo a Matriz A ----");
        for (int i = 0; i < 15; i++) {
            while (true) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º elemento para a matriz A: ");
                    matrizA[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                }
            }
        }

        for (int i = 0; i < 15; i++) {
            matrizB[i] = matrizA[i] * matrizA[i];
        }

            System.out.println("\n---- Matriz A ----");
        for (int elemento : matrizA) {
            System.out.print(elemento + " ");
        }

        System.out.println();
        System.out.println("\n---- Matriz B (Quadrados da Matriz A) ----");
        for (int elemento : matrizB) {
            System.out.print(elemento + " ");
        }

        System.out.println();
        scanner.close();
    }
}