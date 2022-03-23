soma = 0
cont = 0
media = 0
lista = []
while True:
	entrada = input()
	if entrada == 'fim': break
	soma += int(entrada)
	cont += 1
	lista.append(entrada)
media = soma / cont
print(f'{media:.2f}')
for c in range(len(lista)):
	if int(lista[c]) < media:
		print(c+1,lista[c])

