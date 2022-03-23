sequencia = input().split()
par = ''
impar = ''
real = ''
for c in range(len(sequencia)):
	if int(sequencia[c]) % 2 == 0:
		par += str(sequencia[c])
		real += str(sequencia[c])
	else:
		impar += str(sequencia[c])
		real += str(sequencia[c])
final = impar + par
if final == real:
	print('ok')
else:
	print('erro')
