nomes = []
precos = []
quantidades = []

for i in range(5):
    print(f"\nProduto {i+1}:")
    nomes.append(input("Nome: "))
    precos.append(float(input("Preço: ")))
    quantidades.append(int(input("Quantidade: ")))

# Mostrar produtos
print("\n--- Lista de Produtos ---")
for i in range(5):
    print(f"{nomes[i]} - Preço: {precos[i]} - Quantidade: {quantidades[i]}")

# Calcular valor total
total = 0
for i in range(5):
    total += precos[i] * quantidades[i]

print("\nValor total em estoque:", total)

# Produto com maior quantidade
maior = quantidades[0]
indice = 0

for i in range(1, 5):
    if quantidades[i] > maior:
        maior = quantidades[i]
        indice = i

print("Produto com maior quantidade:", nomes[indice])