def tem123plus(l):
    num_atual = 0
    resultado = -1
    index = -1
    for num in range(len(l)):
        if l[num] == 1 and index == -1:
            num_atual = 1
            index = num
        if l[num] == 2 and num_atual == 1:
            num_atual = 2
        if l[num] == 3 and num_atual == 2:
            resultado = index
    return resultado
    
assert tem123plus([1,2,3,1,2,3]) == 0
assert tem123plus([4, 1, 1, 1, 4, 2, 3]) == 1
assert tem123plus([1, 2, 2, 3]) == 0
assert tem123plus([1, 2, 2, 4]) == -1
