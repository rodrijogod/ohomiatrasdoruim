import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sacnner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;
        double media = 0, media2 = 0;

        nota1 = 7.5;
        nota2 = 8.0;
        media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        nota3 = 6.0;
        nota4 = 9.0;
        media2 = (nota3 + nota4) / 2;
        System.out.println("A média é: " + media2);

        scanner.close();
    }
}