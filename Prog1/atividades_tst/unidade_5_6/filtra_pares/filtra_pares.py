conjunto = []
while True:
	sequencia = input().split()
	if sequencia == ['fim']: break
	else:
		conjunto.append(sequencia)
cont_seq_par = 0
lista_par = []
for c in range(len(conjunto)):
	par = impar = 0
	for i in range(len(conjunto[c])):
		if int(conjunto[c][i]) % 2 == 0:
			par += 1
		else:
			impar += 1
	if par > impar:
		cont_seq_par += 1
		lista_par.append(conjunto[c])
print(f'filtradas: {cont_seq_par}')
for c in range(len(lista_par)):
	lista_par_final = ''
	for i in range(len(lista_par[c])):
		lista_par_final += lista_par[c][i] + ' '
	print(lista_par_final.strip())
	
