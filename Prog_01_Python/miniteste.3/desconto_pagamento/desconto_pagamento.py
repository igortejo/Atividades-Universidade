pagamento = int(input())
valor = float(input())
if pagamento == 1:
    a1 = valor * 0.85
    print(f'Valor final: R$ {a1:.2f}')
elif pagamento == 2:
    a2 = valor * 0.95
    print(f'Valor final: R$ {a2:.2f}')
elif pagamento == 3:
    a3 = valor
    print(f'Valor final: R$ {a3:.2f}')
elif pagamento == 4:
    a4 = valor * 1.1
    print(f'Valor final: R$ {a4:.2f}')

