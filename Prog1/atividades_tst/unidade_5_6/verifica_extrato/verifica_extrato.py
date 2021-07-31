limite_saque = int(input())
saldo = float(input())
while True:
	operacao, valor = input().split()
	valor = float(valor)
	if operacao == 'saque' and limite_saque > 0 and saldo >= valor:
		saldo -= valor
		limite_saque -= 1
	elif operacao == 'depósito' and valor <= 1000:
		saldo += valor
	elif (operacao == 'saque' and limite_saque <= 0) or (operacao == 'depósito' and valor > 1000) or (operacao == 'saque' and saldo < valor): break
print(f'Operação inválida: {operacao} {valor:.2f}.')
print(f'Seu saldo é R$ {saldo:.2f}.')
