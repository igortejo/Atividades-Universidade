numero = int(input())
if numero < 0:
	numero = numero * -1
i = 1
cont = 0
while True:
	if cont == len(str(numero)): break
	a = ((numero % (10*i)) - (numero % (1*i))) // i
	i *= 10
	cont += 1
	print(a)

