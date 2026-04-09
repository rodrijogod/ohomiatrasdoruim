import java.util.Scanner;

public class Ex2_V2 {

    public static double calcular_area_retangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura;
        System.out.print("Digite a base: ");
        base = sc.nextDouble();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        double area = calcular_area_retangulo(base, altura);

        System.out.println("A área do retângulo é: " + area);
    }
}