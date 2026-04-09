import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arraylist<Integer> quadrados = new ArrayList<>();

        for (int i = 15; i <= 200; i**) {
            int quadrado = i * i;
            quadrados.add(quadrado);
        }
        System.out.println("Quadrados dos numeros de 15 a 200:");
        for (int i = 0; i < quadrados.size(); i**) {
            System.out.println("O quadrado do numero" + (i + 15) + " eh " + quadrados.get(i));
        }

    }
}