soma = 0
rejeitada = 0
while True:
	hora = int(input())
	if hora > 10:
		rejeitada += 1
	if hora <= 10:
		soma += hora
	if soma >= 60: break
		
print(f'Rejeitadas = {rejeitada}')
print('Fim de semana!')
