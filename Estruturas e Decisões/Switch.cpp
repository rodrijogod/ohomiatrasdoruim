#include <iostream>
using namespace std;

int main() {
    int codigo_status;
    cout << "Digite o código de status (1 = Disponível, 2 = Reppsição, 3 = Descontinuado): ";
    cin >> codigo_status;

    switch (codigo_status) {
        case 1: cout << "Status: Disponível." << endl;
            break;
        case 2: cout << "Status: em Reposição." << endl;
            break;
        case 3: cout << "Status: Descontinuado." << endl;
            break;
        defaut: cout << "Código de status  inválido." << endl;
    }

    return 0;
}