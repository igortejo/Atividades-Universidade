import math
x1 = int(input())
y1 = int(input())
x2 = int(input())
y2 = int(input())
x3 = int(input())
y3 = int(input())
lado1 = math.sqrt((x1 - x2)**2 + (y1 - y2)**2)
lado2 = math.sqrt((x2 - x3)**2 + (y2 - y3)**2)
lado3 = math.sqrt((x3 - x1)**2 + (y3 - y1)**2)
perimetro = lado1 + lado2 + lado3
print(f'O perímetro é de {perimetro:.2f}')
