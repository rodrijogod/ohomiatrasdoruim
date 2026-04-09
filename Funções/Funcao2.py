def exibir_menu():
    print("-" * 30)
    print("     MENU DE ESTOQUE     ")
    print("-" * 30)
    print("1. Adicionar novo produto")
    print("2. Listar produtos em estoque")
    print("3. Sair")
    print("-" * 30)

nome_produto1 = ""
quantidade_produto_1 = 0
preco_produto_1 = 0.0
rodando = True

while rodando:

    exibir_menu()