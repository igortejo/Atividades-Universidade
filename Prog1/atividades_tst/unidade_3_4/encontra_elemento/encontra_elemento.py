numero = input()
sequencia = input().split()
for c in range(len(sequencia)):
    if sequencia[c] == numero:
        msg = 'sim'
        break
    else:
        msg = 'não'
print(msg)
