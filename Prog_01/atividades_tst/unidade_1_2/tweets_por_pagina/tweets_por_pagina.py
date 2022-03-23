t = int(input())
c = t // 400
perdidos = t - (c*400)
total_perdidos = (perdidos / t)*100
print(f'Serão necessárias {c} página(s) para visualizar os tweets.')
print(f'{total_perdidos:.1f}% dos tweets serão perdidos.')
