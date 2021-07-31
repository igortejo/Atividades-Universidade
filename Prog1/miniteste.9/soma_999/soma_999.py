soma = 0
cont = 0
media = 0
lista = []
while True:
	numero = int(input())
	soma += numero
	cont += 1
	media = soma / cont
	lista.append(numero)
	if soma >= 999: break
media = soma / cont
print(soma)
print(f'{media:.2f}')
maiores = 0
for c in range(len(lista)):
	if lista[c] > media:
		maiores += 1
print(maiores)
	
