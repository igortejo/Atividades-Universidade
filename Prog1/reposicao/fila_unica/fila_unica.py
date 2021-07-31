def gera_filas(fila, n):
    fim = 0
    atendente = 0
    resultado = cria_fila_atendente(n)
    while fim != len(fila): 
        resultado[atendente].append(fila[fim])
        if atendente == n - 1:
            atendente = 0
        else: atendente += 1 
        fim += 1
    return resultado
        
def cria_fila_atendente(tamanho): 
    lista = []
    for i in range(tamanho):
        lista.append([])
    return lista
        
 
fila_1 = ['Andre', 'Antonio', 'Bianca', 'Carlos', 'Claudia']
assert gera_filas(fila_1, 3) == [['Andre','Carlos'],['Antonio', 'Claudia'], ['Bianca']]

fila_2 = ['Andre', 'Antonio', 'Bianca', 'Carlos']
assert gera_filas(fila_2, 2) == [['Andre','Bianca'],['Antonio', 'Carlos']]
