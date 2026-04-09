#include <iostream>
using namespace std;

int main() {
    double soma = 0;

    for (int i = 1; i <= 5; i++) {
        double nota;
        cout << "Digite a nota " << i << ": ";
        cin >> nota;
        soma += nota;
    }

    double media = soma / 5;

    cout << "Média final: " << media << endl;

    return 0;
}