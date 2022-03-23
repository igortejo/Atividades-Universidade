def inverte2a2_condicional(seq):
	for c in range(0,len(seq)-1,2):
		if seq[c] > seq[c+1]:
			seq[c], seq[c + 1] = seq[c + 1], seq[c]				
	return seq




sequencia = [3,1,2,3,10,5,6]
inverte2a2_condicional(sequencia)
