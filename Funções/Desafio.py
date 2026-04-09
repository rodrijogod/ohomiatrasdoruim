def verificar_estoque_critico(quantidade):
    if quantidade < 5:
        return "⚠️ Estoque crítico!"
    else:
        return "Estoque OK"

def exibir_cabecalho():
    print("     ========================    ")
    print("     SORVETERIA DO DENER         ")
    print("     ========================     ")

# Dados
insumos = ["Leite", "Açúcar", "Chocolate", "Baunilha", "Morango"]
estoque = [10, 3, 7, 2, 15]

# Programa principal
exibir_cabecalho()

i = 0
while i < len(insumos):
    print(f"\nInsumo: {insumos[i]}")
    print(f"Quantidade: {estoque[i]}")
    print(verificar_estoque_critico(estoque[i]))
    i += 1