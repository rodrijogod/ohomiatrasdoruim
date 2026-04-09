#include <iostream>
using namespace std;

double calcular_area_retangulo(double base, double altura) {
    return base * altura;
}

int main() {
    double base, altura;

    cout << "Digite a base: ";
    cin >> base;

    cout << "Digite a altura: ";
    cin >> altura;

    double area = calcular_area_retangulo(base, altura);

    cout << "A área do retângulo é: " << area << endl;

    return 0;
}   