conjuntos = []
conjunto = []
while True:
	entrada = input()
	if entrada == '**': break
	elif entrada == '*':
		conjuntos.append(conjunto)
		conjunto = []
	else:
		conjunto.append(entrada)
soma = []
soma_total = 0
for c in range(len(conjuntos)):
	total = 0
	for i in range(len(conjuntos[c])-1):
		soma_total += int(conjuntos[c][i+1])
		total += int(conjuntos[c][i+1])
	soma.append(conjuntos[c][0])
	soma.append(total)
print('Relatório de novas questões:')
print('\n',end='')
for c in range(0,len(soma)-1,2):
	print(f'{soma[c]}: {soma[c+1]}')
print('---')
print(f'Total de novas questões: {soma_total}')
