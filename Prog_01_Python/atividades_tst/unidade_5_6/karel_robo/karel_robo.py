x = 0
y = 0
while True:
	direcao, unidade = input().split()
	unidade = int(unidade)
	if direcao == 'C':
		y += unidade
	if direcao == 'B':
		unidade = unidade * (-1)
		y += unidade
	if direcao == 'E':
		unidade = unidade * (-1)
		x += unidade
	if direcao == 'D':
		x += unidade
	if y == (2*x) and x != 0 and y != 0 or y == -(2*x) and x != 0 and y != 0:
		print(f'Parabéns, conquista do portal ({x}, {y})')
		break
	if  unidade == 0:
		print('Fim de jogo')
		break

