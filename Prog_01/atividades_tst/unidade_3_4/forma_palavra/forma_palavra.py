palavra1 = input()
palavra2 = input()
palavra3 = input()
final = ''
for c in range(len(palavra1)):
    if palavra1[c] < palavra2[c] < palavra3[c]:
        final += palavra3[c]
    elif palavra1[c] < palavra3[c] < palavra2[c]:
        final += palavra2[c]
    elif palavra2[c] < palavra1[c] < palavra3[c]:
        final += palavra3[c]
    elif palavra2[c] < palavra3[c] < palavra1[c]:
        final += palavra1[c]
    elif palavra3[c] < palavra1[c] < palavra2[c]:
        final += palavra2[c]
    elif palavra3[c] < palavra2[c] < palavra1[c]:
        final += palavra1[c]
    elif palavra1[c] == palavra2[c] < palavra3[c]:
        final += palavra3[c]
    elif palavra1[c] == palavra3[c] < palavra2[c]:
        final += palavra2[c]
    elif palavra2[c] < palavra3[c] < palavra3[c]:
        final += palavra3[c]
    elif palavra1[c] == palavra2[c] > palavra3[c]:
        final += palavra1[c]
    elif palavra1[c] == palavra3[c] > palavra2[c]:
        final += palavra1[c]
    elif palavra2[c] == palavra3[c] > palavra1[c]:
        final += palavra2[c]
    elif palavra2[c] == palavra3[c] ==  palavra1[c]:
        final += palavra1[c]
print(final)
