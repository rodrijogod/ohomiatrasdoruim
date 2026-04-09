A = []
B = []

print("Digite os valores do vetor A:")

for i in range(15):
    valor = int(input(f"A[{i}]: "))
    A.append(valor)

for i in range(15):
    B.append(A[i] ** 2)

print("\nVetor A:")
print(A)

print("\nVetor B (quadrados):")
print(B)