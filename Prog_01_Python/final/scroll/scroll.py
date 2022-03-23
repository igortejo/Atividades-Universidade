def scroll(m):
    for c in range(len(m)):
        if c == len(m)-1:
            m[c] = gera_zero(len(m[c]))
        else:    
            m[c] = m[c+1]
    return None
    
def gera_zero(numero):
    resultado = []
    for c in range(numero):
        resultado.append(0)
    return resultado
    
m = [[  1,  2,  3,  4 ],
     [  5,  6,  7,  8 ],
     [  9, 10, 11, 12 ],
     [ 13, 14, 15, 16 ],
     [ 17, 18, 19, 20 ]]

scroll(m)
assert m == [[  5,  6,  7,  8 ],
             [  9, 10, 11, 12 ],
             [ 13, 14, 15, 16 ],
             [ 17, 18, 19, 20 ],
             [  0,  0,  0,  0 ]]
