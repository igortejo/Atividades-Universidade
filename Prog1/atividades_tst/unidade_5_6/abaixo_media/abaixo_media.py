soma = 0
cont = 0
media = 0
lista = []
while True:
	sequencia = input()
	if sequencia == 'fim': break
	lista.append(int(sequencia))
	soma += int(sequencia)
	cont += 1
media = soma / cont
print(f'{media:.2f}')
for c in range(len(lista)):
	if lista[c] < media:
		print(c+1, lista[c])
