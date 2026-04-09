#include <iostream>
using namespace std;

int main() {
    double A[20], B[20], C[20];

    cout << "Digite os valores do vetor A:" << endl;
    for (int i = 0; i < 20; i++) {
        cout << "A[" << i << "]: ";
        cin >> A[i];
    }

    cout << "\nDigite os valores do vetor B:" << endl;
    for (int i = 0; i < 20; i++) {
        cout << "B[" << i << "]: ";
        cin >> B[i];
    }

    for (int i = 0; i < 20; i++) {
        C[i] = A[i] - B[i];
    }

    cout << "\nVetor C (A - B):" << endl;
    for (int i = 0; i < 20; i++) {
        cout << "C[" << i << "] = " << C[i] << endl;
    }

    return 0;
}