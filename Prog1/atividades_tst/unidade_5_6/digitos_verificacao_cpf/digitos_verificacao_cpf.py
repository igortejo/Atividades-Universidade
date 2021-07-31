def calcula_digitos_verificacao(cpf):
	cont = 2
	cont2 = 3
	soma = 0
	soma2 = 0
	for c in range(8,0-1,-1):
		soma += (int(cpf[c]) * cont)
		cont += 1
		soma2 += (int(cpf[c]) * cont2)
		cont2 += 1
	primeiro_digito = (10 * (soma)) % 11
	if primeiro_digito == 10:
		primeiro_digito = 0
	segundo_digito = ((soma2 + (primeiro_digito * 2)) *10) % 11
	final = str(primeiro_digito) + str(segundo_digito)
	return final

 
print(calcula_digitos_verificacao('153245875'))
