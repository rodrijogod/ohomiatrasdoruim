#include <iostream>
using namespace std;

int main() {
    double base, altura;

    cout << "Digite a base: ";
    cin >> base;

    cout << "Digite a altura: ";
    cin >> altura;

    double area = base * altura;

    cout << "A área do retângulo é: " << area << endl;

    return 0;
}