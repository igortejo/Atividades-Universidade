soma = 0
cont = 0
todos = []
while True:
	numero = input()
	soma += float(numero)
	cont += 1
	media = soma / cont
	if float(numero) <= media:
		todos.append(numero)
	if float(numero) > media:
		todos.append(numero)
	if soma >= 100: break
print(f'Quantidade de números lidos: {cont}')
print(f'Soma dos números lidos: {soma:.2f}')
print(f'Média = {media:.2f}')
print('')
print('Abaixo da média')
for i in range(len(todos)):
	if float(todos[i]) < media:
		print(f'{float(todos[i]):.2f} ({i+1}o)')
print('')
print('Acima da média')
for c in range(len(todos)):
	if float(todos[c]) > media:
		print(f'{float(todos[c]):.2f} ({c+1}o)')
		

