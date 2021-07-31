def concatena_simetricos(valores):
    ultimo_valor = ''
    simetricos = []
    if len(valores) % 2 != 0:
        ultimo_valor = valores[int(len(valores) / 2 - 0.5)]
    for c in range(len(valores)):
        if c == len(valores)/2: break
        if len(valores) % 2 != 0 and c == int(len(valores) / 2 - 0.5): break
        simetricos.append(ordem_alfabetica(valores[c],valores[-c-1]))
    if len(valores) % 2 != 0:
        simetricos.append(ultimo_valor)    
    return(simetricos)

def ordem_alfabetica(a,b):
    if a[0] > b[0]:
        return(b+a)
    else:
        return(a+b)


assert concatena_simetricos(["bola", "tv", "zebra", "arara"]) == ["ararabola", "tvzebra"]
assert concatena_simetricos(["ab", "cd", "ef", "gh", "ij"]) == ["abij", "cdgh", "ef"]
assert concatena_simetricos(["cd", "gh", "ck"]) == ["cdck", "gh"]
