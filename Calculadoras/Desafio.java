import java.util.Scanner;

public class CalculadoraROI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lucro, investimento;

        System.out.print("Digite o lucro: ");
        lucro = sc.nextDouble();

        System.out.print("Digite o investimento: ");
        investimento = sc.nextDouble();

        if (investimento == 0) {
            System.out.println("Erro: investimento não pode ser zero.");
        } else {
            double roi = (lucro - investimento) / investimento;
            System.out.println("ROI: " + roi);
        }
    }
}