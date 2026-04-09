#include <iostream>
using namespace std;

string verificar_estoque_critico(int quantidade) {
    if (quantidade < 5) {
        return "Estoque crítico!";
    } else {
        return "Estoque OK";
    }
}

void exibir_cabecalho() {
    cout << "========================" << endl;
    cout << "   SORVETERIA DO DENER  " << endl;
    cout << "========================" << endl;
}

int main() {

    string insumos[5] = {"Leite", "Açúcar", "Chocolate", "Baunilha", "Morango"};
    int estoque[5] = {10, 3, 7, 2, 15};

    exibir_cabecalho();

    int i = 0;
    while (i < 5) {
        cout << "\nInsumo: " << insumos[i] << endl;
        cout << "Quantidade: " << estoque[i] << endl;
        cout << verificar_estoque_critico(estoque[i]) << endl;
        i++;
    }

    return 0;
}