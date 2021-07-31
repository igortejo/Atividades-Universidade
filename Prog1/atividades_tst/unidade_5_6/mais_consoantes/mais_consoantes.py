cont = 0
while True:
	palavra = input()
	cont += 1
	i = consoantes = vogais = 0
	while i < len(palavra):
		if palavra[i] in 'AEIOUaeiou':
			vogais += 1
		else:
			consoantes += 1
		i += 1
	if consoantes > vogais: break
print(cont)
