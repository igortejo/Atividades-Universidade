def soma_intervalo(a,b):
	soma = 0
	for c in range(a,b+1):
		soma += c
	return(soma)

#def mult_2(a,b):
#	cont = 0
#	for c in range(a,b+1):
#		if c % 2 == 0:
#			cont += 1
#	return(cont)

#while True:
#	a = input()
#	if a == 'fim': break
#	b = input()
#	if b == 'fim': break
#	print(soma_intervalo(int(a),int(b)))
#	print(f'multiplos: {mult_2(int(a),int(b))}')



assert soma_intervalo(5,15) == 110
assert soma_intervalo(10,10) == 10
#assert mult_2(5,15) == 5
