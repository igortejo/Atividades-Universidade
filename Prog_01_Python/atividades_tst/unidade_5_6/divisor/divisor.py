def divisor(num,lista):
	for c in range(len(lista)):
		if int(lista[c]) % num == 0:
			resposta = c
			break
		elif c == len(lista)-1:
			resposta = -1	
	
	return resposta


lista1 = [100,10,40,50]
lista2 = [3,15,50,23,5]
assert divisor(10, lista1) == 0
assert divisor(5, lista2) == 1
