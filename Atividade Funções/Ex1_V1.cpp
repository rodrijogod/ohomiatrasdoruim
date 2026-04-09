#include <iostream>
using namespace std;

int main() {
    int numero;
    cin >> numero;

    if (numero % 2 == 0) {
        cout << "PAR";
    } else {
        cout << "ÍMPAR";
    }

    return 0;
}