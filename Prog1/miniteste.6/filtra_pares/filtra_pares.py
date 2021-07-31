conjunto = []
while True:
	sequencia = input()
	if sequencia == 'fim': break
	else:
		conjunto.append(sequencia)
cont_seq_par = 0
for c in range(len(conjunto)):
	par = impar = 0
	for i in range(len(conjunto[c])):
		if int(conjunto[c][i]) % 2 == 0:
			par += 1
		else:
			impar += 1
	if par > impar:
		cont_seq_par += 1
print(f'filtradas: {cont_seq_par}')
