cont = 0
dist = 0
while True:
	entrada1,entrada2 = input().split()
	distancia = ((float(entrada1)**2) + (float(entrada2)**2))**0.5
	if distancia > 200: break
	print(f'{distancia:.2f}cm')
	cont += 1
	dist += distancia
dist_media = dist / cont
print('--')
print(f'num disparos: {cont}')
print(f'distancia media: {dist_media:.2f}cm')
