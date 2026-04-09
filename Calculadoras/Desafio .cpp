#include <iostream>
using namespace std;

int main() {
    double lucro, investimento;

    cout << "Digite o lucro: ";
    cin >> lucro;

    cout << "Digite o investimento: ";
    cin >> investimento;

    if (investimento == 0) {
        cout << "Erro: investimento não pode ser zero." << endl;
    } else {
        double roi = (lucro - investimento) / investimento;
        cout << "ROI: " << roi << endl;
    }

    return 0;
}   