def negativos_no_fim(lista):
  i = len(lista) - 1 
  indice_atual = len(lista) - 1
  while i != -1:
    if lista[i] < 0:
        lista[i], lista[indice_atual] = lista[indice_atual], lista[i]
        indice_atual -= 1
    i -= 1
  return None
    
fila = [12, -21, -35, 8, 12, 15]
assert negativos_no_fim(fila) == None
assert fila == [12, 12, 15, 8, -21, -35]
