gols_cc = int(input())
gols_galo = int(input())
if gols_cc > gols_galo:
    msg = 'Campinense'
elif gols_cc < gols_galo:
    msg = 'Treze'
else:
    msg = 'Empate'
print(msg)
