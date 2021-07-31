numero = int(input())
hexa = ''
while numero != 0:
    #if numero == 0:
#	print('0')
    q = int(numero / 16)
    r = numero % 16
    print(f'q = {q}, r = {r}')
    if r >= 10:
        hexa += chr(97+r-10)
    else: 
        hexa += str(r)
    numero = q
print(hexa[-1])
