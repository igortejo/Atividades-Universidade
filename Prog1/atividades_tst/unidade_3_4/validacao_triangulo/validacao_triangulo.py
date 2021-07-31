lado1 = float(input())
lado2 = float(input())
lado3 = float(input())
if lado1 < (lado2 + lado3) and lado2 < (lado1 + lado3) and lado3 < (lado1 + lado2):
    print(f'triangulo valido. {lado1 + lado2 + lado3:.0f}')
else:
    print('triangulo invalido.')
