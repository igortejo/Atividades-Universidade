alvo = int(input())
conjuntos = []
while True:
	sequencia = input().split()
	if sequencia == ['fim']: break
	conjuntos.append(sequencia)
for c in range(len(conjuntos)):
	seq = ''
	maiores = 0
	for i in range(len(conjuntos[c])):
		if int(conjuntos[c][i]) > alvo:
			maiores += 1
		if i != len(conjuntos[c])-1:
			seq += conjuntos[c][i] + ' '
		if i == len(conjuntos[c])-1:
			seq += conjuntos[c][i]
	if maiores > (len(conjuntos[c])/2):
		print(f'sequencia {c+1}: {seq}')
