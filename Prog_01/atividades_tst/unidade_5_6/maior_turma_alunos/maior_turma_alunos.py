conjunto = []
maior_conjunto = []
while True:
	entrada = input()
	if entrada == '-1':
		if len(conjunto) > len(maior_conjunto):
			maior_conjunto = conjunto
		conjunto = []
	elif entrada == 'fim':
		break
	else:
		conjunto.append(entrada)
if maior_conjunto != []:
	print(f'{maior_conjunto[0]}: {len(maior_conjunto)-1} aluno(s)')	
