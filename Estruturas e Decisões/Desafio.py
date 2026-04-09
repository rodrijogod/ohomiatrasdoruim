nome = input("Digite o nome do produto: ")
quantidade = int(input("Digite a quantidade em estoque: "))
preco = float(input("Digite o preço unitário: "))

if quantidade >= 0:
    print("\n--- Produto Cadastrado ---")
    print("Nome:", nome)
    print("Quantidade:", quantidade)
    print("Preço:", preco)
else:
    print("Erro: A quantidade não pode ser um valor negativo.")