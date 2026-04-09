quantidade = int(input("Digite a quantidade em estoque: "))

if quantidade < 1:
    print("Status: Em falta.")
elif quantidade < 5: 
    print("Status: Alerta de estoque baixo")
else:
    print("Status: Estoque OK.")