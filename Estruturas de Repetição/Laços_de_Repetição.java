import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("\Adivinhe o número com 'while' em Java!");
        Scanner scanner = new  Scanner(System.in);
        int numero_secreto = 7;
        int numero_digitado = 0;

        while (numero_digitado != numero_secreto) {
            System.out.println("Digite um número: ");
            numero_digitado = scanner.nextInt();
            if ( numero_digitado != numero_secreto) {
                System.out.println("Número incorreto. Tente novamente.");

            }
        }

        System.out.println("Parabéns! Você acertou!");
        scanner.close();
    }
}