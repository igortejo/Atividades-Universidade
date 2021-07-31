limite = input()
seq = []
while True:
	sequencia = input().split()
	if sequencia == ['-']: break
	soma = 0
	somatorio = ''
	for c in range(len(sequencia)):
		soma += int(sequencia[c])
		if c != len(sequencia)-1:
			somatorio += sequencia[c] + ' + '
		else:
			somatorio += sequencia[c] + ' = ' + str(soma)
	if soma >= int(limite):
		seq.append(somatorio)
	if soma > 5 * int(limite): break
for c in seq:
	print(c)
