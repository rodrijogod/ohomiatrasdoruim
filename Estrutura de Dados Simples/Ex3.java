import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite os valores do vetor A:");

        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nVetor B (quadrados):");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }
    }
}