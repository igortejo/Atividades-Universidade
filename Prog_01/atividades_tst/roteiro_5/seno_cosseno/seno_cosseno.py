import math
angulo_inicial = float(input())
delta = float(input())
linhas_tabela = int(input())
print('|Angulo|  Seno|Cosseno|')
for c in range(linhas_tabela):
    angulo_inicial = angulo_inicial + delta
    seno = math.asin(angulo_inicial)
    print(f'{angulo_inicial:7.1f}{seno}')
