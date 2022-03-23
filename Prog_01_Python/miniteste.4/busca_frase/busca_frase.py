frase = input()
caracteres = input()
car = 0
for c in range(len(frase)):
    if frase[c] == caracteres[car]:
        car += 1
        print(caracteres[car], car)

