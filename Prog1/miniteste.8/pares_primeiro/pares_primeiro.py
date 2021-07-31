def pares_primeiro(lista): 
  listaFinal = []
  impares = []
  for i in range(len(lista)):
     if lista[i] % 2 == 0:
        listaFinal.append(lista[i])
     else:
        impares.append(lista[i])
  listaFinal += impares
  return listaFinal


lista = [3, 6, 4, 0, 7, 8, 11]
print(pares_primeiro(lista))
#assert pares_primeiro(lista) == [6, 4, 0, 8, 3, 7, 11]
#lista == [3, 6, 4, 0, 7, 8, 11]
