graus = int(input())
minutos = int(input())
segundos = int(input())
graus1 = minutos / 60
graus2 = segundos / 3600
graus_total = graus + graus1 + graus2
print(f'graus = {graus_total:.4f}')
