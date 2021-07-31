codigo = int(input())
if codigo == 1:
    print('Deverá receber em dezembro R$ 25000.00.')
elif codigo == 2:
    print('Deverá receber em dezembro R$ 15000.00.')
elif codigo == 3:
    faltas = int(input())
    if faltas == 0:
        print('Valor da gratificação R$ 500.00.')
        print(f'Deverá receber em dezembro R$ {8000 + 500:.2f}')
    else:
        salario1 = 8000
        total1 = (235 - faltas)*2
        print(f'Valor da gratificação R$ {total1:.2f}.')
        print(f'Deverá receber em dezembro R$ {salario1 + total1:.2f}.')
elif codigo == 4:
    faltas = int(input())
    if faltas == 0:
        print('Valor da gratificação R$ 300.00.')
        print(f'Deverá receber em dezembro R$ {5000 + 300:.2f}.')
    else:
        salario2 = 5000
        total2 = (235 - faltas)*1
        print(f'Valor da gratificação R$ {total2:.2f}.')
        print(f'Deverá receber em dezembro R$ {salario2 + total2:.2f}.')
elif codigo == 5:
    faltas = int(input())
    if faltas == 0:
        print('Valor da gratificação R$ 200.00.')
        print(f'Deverá receber em dezembro R$ {2800 + 200:.2f}.')
    else:
        salario3 = 2800
        total3 = (235 - faltas)*0.70
        print(f'Valor da gratificação R$ {total3:.2f}.')
        print(f'Deverá receber em dezembro R$ {salario3 + total3:.2f}.')


