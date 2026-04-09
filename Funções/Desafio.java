public class Sorveteria {

    public static String verificar_estoque_critico(int quantidade) {
        if (quantidade < 5) {
            return "Estoque crítico!";
        } else {
            return "Estoque OK";
        }
    }

    public static void exibir_cabecalho() {
        System.out.println("========================");
        System.out.println("   SORVETERIA DO DENER  ");
        System.out.println("========================");
    }

    public static void main(String[] args) {

        String[] insumos = {"Leite", "Açúcar", "Chocolate", "Baunilha", "Morango"};
        int[] estoque = {10, 3, 7, 2, 15};

        exibir_cabecalho();

        int i = 0;
        while (i < insumos.length) {
            System.out.println("\nInsumo: " + insumos[i]);
            System.out.println("Quantidade: " + estoque[i]);
            System.out.println(verificar_estoque_critico(estoque[i]));
            i++;
        }
    }
}