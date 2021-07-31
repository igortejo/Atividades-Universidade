peso = 0
combustivel = 0
altitude = 0
while True:
	dados = input().split()
	if int(dados[0]) >= 0:
		peso += 1
	else:
		print('dado inconsistente. peso negativo.')
		break
	
	if int(dados[1]) >= 0:
		combustivel += 1
	else:
		print('dado inconsistente. combustível negativo.')
		break	
	
	if int(dados[2]) >= 0:
		altitude += 1
	else:
		print('dado inconsistente. altitude negativa.')	
		break	
print(f'peso: {peso}')
print(f'combustível: {combustivel}')
print(f'altitude: {altitude}')

