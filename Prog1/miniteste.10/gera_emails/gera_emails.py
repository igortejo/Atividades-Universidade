def gera_emails(lista):
	final = []
	for c in range(len(lista)):
		dados = lista[c].lower().split()
		final.append(dados[0] +'.'+ dados[-1] + '@ccc.ufcg.edu.br')
	return final
		






nomes = ['Mariana Silva Lima', 'Joao Arthur', 'Pedro Alvares Cabral']
emails = ['mariana.lima@ccc.ufcg.edu.br', 'joao.arthur@ccc.ufcg.edu.br', 'pedro.cabral@ccc.ufcg.edu.br']
assert gera_emails(nomes) == emails
