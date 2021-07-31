p = float(input())
denominador = 1
referencia = 2/3
soma_total = 1.0
zero = 0.0
print(f'{zero:.14f}')
while True:
    if abs(soma_total - referencia) >= p:
        print(f'{soma_total:.14f}')
        denominador *= 2*(-1)
        soma_total += 1/denominador
    else: break

