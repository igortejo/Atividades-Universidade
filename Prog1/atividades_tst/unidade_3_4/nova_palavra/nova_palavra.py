palavra = input()
repeticoes = input()
cont = 0
nova_palavra = ''
for c in range(len(palavra)):
	nova_palavra += palavra[c]
	nova_palavra += palavra[c]*int(repeticoes[(len(palavra)-1)-cont]) 
	cont += 1
print(nova_palavra)
