#include <iostream>
using namespace std;

int main() {
    int A[15], B[15];

    cout << "Digite os valores do vetor A:" << endl;

    for (int i = 0; i < 15; i++) {
        cout << "A[" << i << "]: ";
        cin >> A[i];
    }

    for (int i = 0; i < 15; i++) {
        B[i] = A[i] * A[i];
    }

    cout << "\nVetor A:" << endl;
    for (int i = 0; i < 15; i++) {
        cout << A[i] << " ";
    }

    cout << "\n\nVetor B (quadrados):" << endl;
    for (int i = 0; i < 15; i++) {
        cout << B[i] << " ";
    }

    return 0;
}