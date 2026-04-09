import java.util.Scanner;

public class Ex1_V2 {

    public static void verificar_paridade(int numero) {
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        verificar_paridade(numero);
    }
}