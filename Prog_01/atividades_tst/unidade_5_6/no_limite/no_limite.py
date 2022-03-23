soma = 0
cont = 0
medias = []
maior_media = 0
while True:
	entrada = input()
	if entrada == '-': break
	soma += float(entrada)
	cont += 1
	media = soma / cont
	if media > maior_media:
		maior_media = media
	medias.append(media)
	

limite = float(input())
if maior_media <= limite:
	print('limite não alcançado')
else:
	for c in range(len(medias)):
		if medias[c] > limite:
			print(f'media = {medias[c]:.1f}\nnum = {c+1}')
			break	
	
