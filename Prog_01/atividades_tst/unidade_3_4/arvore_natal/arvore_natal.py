altura = int(input())
ultima_linha = (2 * altura) + 1
qtde_zero = 1 
tronco = ''
for c in range(altura):
	qtde_espaco = int((ultima_linha - qtde_zero)/2)-1  
	if c == 0:
		tronco = (qtde_espaco * ' ' + 'o' * qtde_zero)   
	print(qtde_espaco * ' ' + 'o' * qtde_zero)
	qtde_zero += 2
print(tronco)
