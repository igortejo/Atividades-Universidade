numero = input()
sequencia = input().split()
diferentes = ''
for c in range(len(sequencia)):
	if sequencia[c] == numero:
		print(c,end='')
	else:
		diferentes += sequencia[c]
if numero not in sequencia:
	print(-1)												
