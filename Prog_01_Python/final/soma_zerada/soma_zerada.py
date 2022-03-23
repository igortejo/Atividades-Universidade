quantidade = int(input())
soma_zero = 0
while quantidade != 0:
	soma = 0
	seq = input().split()
	quantidade -= 1
	for c in range(len(seq)):
		soma += int(seq[c])
	if soma == 0:
		soma_zero += 1
print(soma_zero)	
