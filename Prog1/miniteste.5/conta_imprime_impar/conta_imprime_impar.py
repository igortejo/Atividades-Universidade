numero = input()
qtde_impares = 0
numeros_impares = ''
for c in range(len(numero)):
	if int(numero[c]) % 2 == 1:
		qtde_impares += 1
		numeros_impares += str(numero[c])
if numeros_impares == '':
	print('0')
	print('-')
else:
	print(qtde_impares)
	print(numeros_impares[len(numeros_impares)-1])	
