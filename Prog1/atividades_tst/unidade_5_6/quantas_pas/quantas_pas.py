razao = int(input())
cont = 0
while True:
	entrada = input().split()
	if entrada == ['fim']: break
	else:
		for c in range(len(entrada)-1):
			if int(entrada[c]) + razao != int(entrada[c+1]): break
		else:
			cont += 1
				 
print(cont)
