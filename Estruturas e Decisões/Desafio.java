import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int quantidade;
        double preco;

        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        quantidade = sc.nextInt();

        System.out.print("Digite o preço unitário: ");
        preco = sc.nextDouble();

        if (quantidade >= 0) {
            System.out.println("\n--- Produto Cadastrado ---");
            System.out.println("Nome: " + nome);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Preço: " + preco);
        } else {
            System.out.println("Erro: A quantidade não pode ser um valor negativo.");
        }
    }
}