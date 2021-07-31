alfabeto = []
for c in range(0,26):
	alfabeto.append(0)
while True:
	entrada = input()
	if entrada == 'S': break
	elif entrada[0] == 'R':
		index = ord(entrada[2]) - 65
		alfabeto[index] += 1
	elif entrada[0] == 'P':
		index = ord(entrada[2]) - 65
		print(alfabeto[index])
		

