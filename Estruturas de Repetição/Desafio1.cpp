#include <iostream>
using namespace std;

int main() {

    // Imprimir números de 1 a 10
    for (int i = 1; i <= 10; i++) {
        cout << i << endl;
    }

    // Lista de nomes
    string nomes[5] = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};

    // Imprimir nomes
    for (int i = 0; i < 5; i++) {
        cout << nomes[i] << endl;
    }

    return 0;
}