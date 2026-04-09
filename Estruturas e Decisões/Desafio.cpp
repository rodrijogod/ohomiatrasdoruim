#include <iostream>
using namespace std;

int main() {
    string nome;
    int quantidade;
    double preco;

    cout << "Digite o nome do produto: ";
    getline(cin, nome);

    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade;

    cout << "Digite o preço unitário: ";
    cin >> preco;

    if (quantidade >= 0) {
        cout << "\n--- Produto Cadastrado ---" << endl;
        cout << "Nome: " << nome << endl;
        cout << "Quantidade: " << quantidade << endl;
        cout << "Preço: " << preco << endl;
    } else {
        cout << "Erro: A quantidade não pode ser um valor negativo." << endl;
    }

    return 0;
}