#include <iostream>
using namespace std;

void verificar_paridade(int numero) {
    if (numero % 2 == 0) {
        cout << "PAR";
    } else {
        cout << "ÍMPAR";
    }
}

int main() {
    int numero;
    cin >> numero;

    verificar_paridade(numero);

    return 0;
}