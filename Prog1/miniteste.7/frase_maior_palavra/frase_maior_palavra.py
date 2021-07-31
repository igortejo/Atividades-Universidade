lista = []
while True:
	frase = input().split()
	if frase == ['fim']: break
	lista.append(frase)
numero_frase = 0
maior_nome = 0
maior_comprimento = 0
for c in range(len(lista)):
	for i in range(len(lista[c])):
		if len(lista[c][i]) > maior_comprimento:
			maior_comprimento = len(lista[c][i])
			numero_frase = c+1
			maior_nome = lista[c][i]
print(f'Frase {numero_frase}: {maior_nome}')
