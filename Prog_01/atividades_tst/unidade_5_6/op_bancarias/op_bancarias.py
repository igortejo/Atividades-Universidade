nome, saldo = input().split()
saldo_final = float(saldo)
while True:
	entrada  = input()
	if entrada == '3': break
	operacao,valor = entrada.split()
	if operacao == '2':
		saldo_final += float(valor)
	elif operacao == '1':
		saldo_final -= float(valor)
print(f'Saldo de R$ {saldo_final:.2f} na conta de {nome}')
