#include <iostream>
using namespace std;

void calcularEExibirMedia(double nota1, double nota2) {
    double media = (nota1 + nota2) / 2;
    cout << "A media eh: " << media << endl;
}

int main () {
    calcularEExibirMedia(7.5, 8.0);
    calcularEExibirMedia(6.0, 9.0);

    return 0;
}