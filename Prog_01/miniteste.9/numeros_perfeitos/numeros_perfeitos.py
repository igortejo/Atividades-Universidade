def seleciona_perfeitos(lista):
    perfeitos = []
    for i in lista: 
        lista_divisores = divisores(i)
        if sum(lista_divisores) == i:
            perfeitos.append(i)
    return(perfeitos)
                    
def divisores(numero):
    lista_div = []
    for a in range(1, numero):
        if numero % a == 0:
            lista_div.append(a)
    return(lista_div)
                    
lista = [3, 6, 9, 12, 15, 18, 19, 21, 28]
assert seleciona_perfeitos(lista) == [6, 28]
assert lista == [3, 6, 9, 12, 15, 18, 19, 21, 28]
