media_sec = input()
final = []
while True:
	media_pref = input().split()
	if media_pref == ['fim']: break
	soma = 0
	cont = 0
	media = 0
	medias = ''
	for i in range(len(media_pref)):
		media_pref[i] = float(media_pref[i])
	for c in range(len(media_pref)):
		soma += media_pref[c]
		cont += 1
		if c != len(media_pref)-1:
			medias += str( media_pref[c]) + ' '
		else:
			medias += str(media_pref[c])
			
	media = soma / cont
	if media > float(media_sec):
		final.append(medias)
	if media < (float(media_sec)/2): break
for c in final:
	print(c)
