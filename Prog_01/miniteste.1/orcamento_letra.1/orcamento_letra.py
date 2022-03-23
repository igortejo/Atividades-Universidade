nome = input("Nome? ")
valor_letra = float(input("Valor da letra (R$)? "))
numero_letras = len(nome)
valor_placa = numero_letras * valor_letra
print(f"Preço final: R$ {valor_placa:.2f}")
