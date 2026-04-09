import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] A = new double[20];
        double[] B = new double[20];
        double[] C = new double[20];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 20; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextDouble();
        }

        System.out.println("\nDigite os valores do vetor B:");
        for (int i = 0; i < 20; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextDouble();
        }

        for (int i = 0; i < 20; i++) {
            C[i] = A[i] - B[i];
        }

        System.out.println("\nVetor C (A - B):");
        for (int i = 0; i < 20; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}