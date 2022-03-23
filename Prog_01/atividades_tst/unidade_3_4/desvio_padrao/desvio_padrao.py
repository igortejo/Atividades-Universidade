seq1 = input().split()
seq2 = input().split()
soma1 = 0
soma2 = 0
quadrado_soma = 0
quadrado_soma2 = 0
for c in range(len(seq1)):
    soma1 += float(seq1[c])
for c in range(len(seq2)):
    soma2 += float(seq2[c])
media_final1 = soma1/len(seq1)
media_final2 = soma2/len(seq2)
for c in range(len(seq1)):
    diferenca1 = float(seq1[c])- media_final1
    quadrado_soma += diferenca1**2
    a = quadrado_soma / (len(seq1)-1)
    b = a**0.5
for c in range(len(seq2)):
    diferenca2 = float(seq2[c]) - media_final2
    quadrado_soma2 += diferenca2**2
    a2 = quadrado_soma2 / (len(seq2)-1)
    b2 = a2**0.5
if b > b2:
    print(f'A sequência 1 possui o maior desvio padrão ({b:.2f}).')
elif b < b2:
    print(f'A sequência 2 possui o maior desvio padrão ({b2:.2f}).')
else:
    print(f'As sequências possuem o mesmo desvio padrão ({b:.2f}).')

