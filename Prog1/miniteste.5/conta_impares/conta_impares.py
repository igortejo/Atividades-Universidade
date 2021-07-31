repeticoes = int(input())
impares = 0
for c in range(repeticoes):
	numero = int(input())
	if numero % 2 == 1:
		impares += 1
print(f'{impares} ({(impares/repeticoes)*100:.1f}%)')
