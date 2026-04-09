#include <iostream>
using namespace std;

int main() {
    string nomes[5];
    double precos[5];
    int quantidades[5];

    for (int i = 0; i < 5; i++) {
        cout << "\nProduto " << i + 1 << ":" << endl;

        cout << "Nome: ";
        cin >> nomes[i];

        cout << "Preço: ";
        cin >> precos[i];

        cout << "Quantidade: ";
        cin >> quantidades[i];
    }

    cout << "\n--- Lista de Produtos ---" << endl;
    for (int i = 0; i < 5; i++) {
        cout << nomes[i] << " - Preço: " << precos[i]
             << " - Quantidade: " << quantidades[i] << endl;
    }

    double total = 0;
    for (int i = 0; i < 5; i++) {
        total += precos[i] * quantidades[i];
    }

    cout << "\nValor total em estoque: " << total << endl;

    int indice = 0;
    for (int i = 1; i < 5; i++) {
        if (quantidades[i] > quantidades[indice]) {
            indice = i;
        }
    }

    cout << "Produto com maior quantidade: " << nomes[indice] << endl;

    return 0;
}