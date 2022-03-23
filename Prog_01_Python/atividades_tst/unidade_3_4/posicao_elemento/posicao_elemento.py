numero = input()
sequencia = input().split()
iguais = ''
#is_in_the_list = False
for c in range(len(sequencia)):
	if sequencia[c] == numero:
		iguais += str(c)+' '
#		is_in_the_list = True
if iguais != '':
	print(iguais.strip())
else:
	print(-1)	
