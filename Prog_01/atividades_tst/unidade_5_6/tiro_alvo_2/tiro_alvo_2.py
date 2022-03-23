melhor_tiro = 1000000000000
tiros = 0
dist_total = 0
while True:
	x = float(input())
	y = float(input())
	distancia = ((x**2) + (y**2))**0.5
	if distancia > 200: break
	else:
		if distancia <= melhor_tiro:
			melhor_tiro = distancia
			print(f'{melhor_tiro:.2f} cm (melhor tiro)')
		else:
			print(f'{distancia:.2f} cm')
	dist_total += distancia
	tiros += 1
media = dist_total / tiros
print('--')
print(f'num tiros: {tiros}')
print(f'melhor tiro: {melhor_tiro:.2f} cm')
print(f'distancia media: {media:.2f} cm')
