def sequencia_caras(lancamentos):
	cara = 0
	maior_cara = 0
	for c in range(len(lancamentos)):
		if lancamentos[c] == 1:
			cara += 1
			if cara >= maior_cara:
				maior_cara = cara
		if lancamentos[c] == 0:
			if cara >= maior_cara:
				maior_cara = cara
			cara = 0
	return maior_cara



assert sequencia_caras([0,1,1,0,1,0,0,0]) == 2
assert sequencia_caras([1,0,1]) == 1
assert sequencia_caras([0,1,1,1,0]) == 3
