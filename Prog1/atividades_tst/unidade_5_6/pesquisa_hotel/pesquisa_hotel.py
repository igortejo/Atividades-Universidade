lista = []
while True:
	registro = input().split(',')
	if registro == ['---']: break
	lista.append(registro)
while True:
	pesquisa = input()
	if pesquisa == 'fim': break
	elif pesquisa == 'valor':
		menor_indice = 0
		for c in range(1,len(lista)):
			if float(lista[c][0]) < float(lista[menor_indice][0]):
				menor_indice = c
		print(lista[menor_indice][3])		
	elif pesquisa == 'tamanho':
		maior_indice = 0
		for c in range(1,len(lista)):
			if float(lista[c][1]) > float(lista[maior_indice][1]):
				maior_indice = c
		print(lista[maior_indice][3])
	else:
		maior_indice = 0
		for c in range(1,len(lista)):
			if float(lista[c][2]) > float(lista[maior_indice][2]):
				maior_indice = c
		print(lista[maior_indice][3])

