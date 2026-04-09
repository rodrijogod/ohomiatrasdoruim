#include <iostream>
using namespace std;

int main() {
    int numeroSecreto = 7;
    int palpite = 0;

    while (palpite != numeroSecreto) {
        cout << "Adivinhe o número: ";
        cin >> palpite;

        if (palpite > numeroSecreto) {
            cout << "Tente um número menor!" << endl;
        } else if (palpite < numeroSecreto) {
            cout << "Tente um número maior!" << endl;
        }
    }

    cout << "Parabéns! Você acertou!" << endl;

    return 0;
}