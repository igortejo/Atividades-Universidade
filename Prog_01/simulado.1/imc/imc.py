peso = float(input(""))
altura = float(input(""))
imc = peso / altura ** 2
imc_ideal = 24.9
peso_ideal = imc_ideal * altura ** 2 
print("IMC atual = {:.2f}".format(imc))
peso_perdido = peso_ideal - peso
print("Peso a ser ganho/perdido = {:.2f}".format(peso_perdido))

