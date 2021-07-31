binario = input()
a = len(binario)
soma = 0
for c in range(len(binario)):
    elemento = int(binario[c])
    b = elemento * (2**(a-1))
    soma = soma + b
    print(f'{elemento} * {2**(a-1)} = {b}')
    a = a - 1
print(f'{binario}(2) = {soma}(10)')

