#include <iostream>
using namespace std;

int main() {
    string senha;

    cout << "Digite uma senha: ";
    cin >> senha;

    while (senha.length() < 8) {
        cout << "Senha inválida! Deve ter pelo menos 8 caracteres." << endl;
        cout << "Digite novamente: ";
        cin >> senha;
    }

    cout << "Senha válida!" << endl;

    return 0;
}