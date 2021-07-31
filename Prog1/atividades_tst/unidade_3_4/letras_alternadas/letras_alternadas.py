palavra = input()
contador = ''
for c in range(len(palavra)):
    if c % 2 == 0:
        contador += palavra[c]
print(contador)

