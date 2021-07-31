pontos_a = int(input(" "))
vitorias_a = int(input(" "))
gols_a = int(input(" "))
gols_sofridos_a = int(input(" "))
pontos_b = int(input(" "))
vitorias_b = int(input(" "))
gols_b = int(input(" "))
gols_sofridos_b = int(input(" "))
saldo_a = gols_a - gols_sofridos_a
saldo_b = gols_b - gols_sofridos_b
if pontos_a > pontos_b:
    msg="O Time A ganhou do Time B."
elif pontos_a < pontos_b:
    msg="O Time B ganhou do Time A."
elif vitorias_a > vitorias_b:
    msg="O Time A ganhou do Time B."
elif vitorias_a < vitorias_b:
    msg="O Time B ganhou do Time A."
elif saldo_a > saldo_b:
    msg="O Time A ganhou do Time B." 
elif saldo_a < saldo_b:
    msg="O Time B ganhou do Time A." 
# elif (gols_a - gols_sofridos_a) < (gols_b - gols_sofridos_b):
    # msg = "O Time B ganhou do Time A."
print(msg)

