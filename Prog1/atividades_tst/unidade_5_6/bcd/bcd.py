while True:
	binario = input()
	if binario == 'fim': break
	elif len(binario) != 8:
		print('Tente novamente.')
	else:		
		primeira_metade = binario[0] + binario[1] + binario[2] + binario[3]
		primeira_metade = int(primeira_metade,2)
		segunda_metade = binario[4] + binario[5] + binario[6] + binario[7]
		segunda_metade = int(segunda_metade,2)
		if primeira_metade < 0 or primeira_metade > 9:
			print('BCD inválido.')
		elif segunda_metade < 0 or segunda_metade > 9:
			print('BCD inválido.')
		else:
			print(str(primeira_metade) + str(segunda_metade))	
