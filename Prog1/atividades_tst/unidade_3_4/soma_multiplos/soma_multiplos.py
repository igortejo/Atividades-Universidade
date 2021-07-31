referencia = int(input())
soma_multiplos = 0
for c in range(10):
	numero = int(input())
	if numero % referencia == 0:
		soma_multiplos += numero
print(soma_multiplos)
