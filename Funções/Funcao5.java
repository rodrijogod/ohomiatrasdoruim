import java.util.Scanner;

public class Main {

    public static void calculareExibirMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        System.out.println("A media eh: " + media);
    }

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         
         calcuarEExibirMedia(7.5, 8.0);
         calcularEExibirMedia(6.0, 9.0);
        
        scanner.close();
    }
}