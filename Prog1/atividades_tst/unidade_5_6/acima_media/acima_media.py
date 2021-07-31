media_mensal = float(input())
media_final = []
while True:
	ocorrencia = input().split()
	if ocorrencia == ['fim']: break
	soma = 0
	cont = 0
	media = 0
	lista = ''
	for c in range(len(ocorrencia)):
		soma += int(ocorrencia[c])
		cont += 1
		if c != len(ocorrencia)-1:
			lista += ocorrencia[c] + ' '
		else:
			lista += ocorrencia[c]
	media = soma/cont
	if media > media_mensal:
		media_final.append(lista)
	if media < (media_mensal/2): break
for c in media_final:
	print(c)
	
