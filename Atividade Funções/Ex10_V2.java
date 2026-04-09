import java.util.Scanner;

public class Ex10_V2 {

    public static void gerar_tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        gerar_tabuada(numero);
    }
}