def	conta_votos(lista, numero):
	yes = 0
	no = 0
	for c in range(len(lista)):
		dados = lista[c].split(',')
		if dados[2] == str(numero):
			if dados[1] == 'sim':
				yes += 1
			else:
				no += 1
	return[yes,no]

votacao = []
votacao.append('greve geral,sim,543,joao,servidor')
votacao.append('greve geral,nao,543,marina,servidor')
votacao.append('indicativo de greve,sim,5,joao,professor')
votacao.append('paralisação,nao,543,julio,professor')
votacao.append('paralisação,sim,543,carlos,professor')
votacao.append('paralisação,sim,543,juliana,professor')
votacao.append('lei 1329,sim,99,joao,servidor')


assert conta_votos(votacao, 543) == [3,2]
