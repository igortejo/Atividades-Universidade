conjuntos = []
conjunto = []
while True:
	entrada = input()
	if entrada == 'fim' or entrada == '---':
		conjuntos.append(conjunto)
		if entrada == 'fim':
			break
		conjunto = []
	else:
		conjunto.append(entrada)
max_par = indexc = 0
for j in range(len(conjuntos)):
	pares = 0
	for i in range(len(conjuntos[j])):
		if int(conjuntos[j][i]) % 2 == 0:
			pares += 1
	if pares > max_par:
		indexc = j
		max_par = pares
if max_par > 0:
	print(f'Conjunto {indexc + 1}: {max_par} par(es)')
