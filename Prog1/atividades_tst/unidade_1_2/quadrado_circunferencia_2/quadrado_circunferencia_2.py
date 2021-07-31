import math
raio = float(input())
lado_quadrado = raio * (2)**0.5
area_quadrado = (lado_quadrado)**2
area_circulo = math.pi * (raio)**2
area_nao_comum = area_circulo - area_quadrado
print(f'Área não comum: {area_nao_comum:.5f}')
