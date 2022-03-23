print('''Mastery Learning
Cálculo da nota na unidade''')
print('')
primeira_nota = float(input('Nota? '))
segunda_nota = 0
media = 0
penalizacao = -0.5
while media < 6:			
	nota = float(input('Nota? '))
	penalizacao += 0.5
	if nota > primeira_nota:
  		segunda_nota = primeira_nota
  		primeira_nota = nota
	elif nota > segunda_nota:
  		segunda_nota = nota
	media = (primeira_nota + segunda_nota) / 2
	if media < 6:
		print(f'Média: {media} (cursando)')
	else:	
		print(f'Média: {media} (aprovado)')
	print(f'Penalização: {penalizacao}\n')
print('===')
print(f'Notas válidas: {primeira_nota} e {segunda_nota}')
print(f'Média parcial na unidade: {media}')
print(f'Penalizações: {penalizacao}')
print(f'Média final na unidade: {media - penalizacao}')
