soma = 0
cont = 0
media = 0
while True:
	valor = float(input())
	if media > valor: break
	soma += valor
	cont += 1
	media = soma / cont
print(f'Saldo total do FIS: R${soma:.2f}.')
print(f'Média das contribuições: R${media:.2f}.')
