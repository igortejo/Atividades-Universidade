conta_corrente = int(input())
n5 = conta_corrente % 10
n4 = conta_corrente // 10 % 10
n3 = conta_corrente // 100 % 10
n2 = conta_corrente // 1000 % 10
n1 = conta_corrente // 10000 % 10
numero_verificador = (n1 + n2 + n3 + n4 + n5) % 11
print(f'{conta_corrente:05}-{numero_verificador:02}')
