lucro = float(input("Digite o lucro: "))
investimento = float(input("Digite o investimento: "))

if investimento == 0:
    print("Erro: investimento não pode ser zero.")
else:
    roi = (lucro - investimento) / investimento
    print("ROI:", roi)