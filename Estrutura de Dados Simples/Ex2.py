A = []
B = []
C = []

print("Digite os valores do vetor A:")
for i in range(20):
    valor = float(input(f"A[{i}]: "))
    A.append(valor)

print("\nDigite os valores do vetor B:")
for i in range(20):
    valor = float(input(f"B[{i}]: "))
    B.append(valor)

for i in range(20):
    C.append(A[i] - B[i])

print("\nVetor C (A - B):")
for i in range(20):
    print(f"C[{i}] = {C[i]}")