palavra = input()
final = ''
for c in range(len(palavra)):
    inversa = palavra[(len(palavra)-1)-c]
    final += inversa
cont = 0
for c in range(len(palavra)):
    if palavra[c] == final[c]:
        cont += 1
print(f'A palavra {palavra} contém {cont} caractere(s) coincidente(s) com a sua inversa.')
