import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] precos = new double[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Preço: ");
            precos[i] = sc.nextDouble();

            System.out.print("Quantidade: ");
            quantidades[i] = sc.nextInt();
            sc.nextLine(); // limpar buffer
        }

        System.out.println("\n--- Lista de Produtos ---");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " - Preço: " + precos[i] + " - Quantidade: " + quantidades[i]);
        }

        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += precos[i] * quantidades[i];
        }

        System.out.println("\nValor total em estoque: " + total);

        int indice = 0;
        for (int i = 1; i < 5; i++) {
            if (quantidades[i] > quantidades[indice]) {
                indice = i;
            }
        }

        System.out.println("Produto com maior quantidade: " + nomes[indice]);
    }
}