ano = int(input())
if ano % 400 == 0:
    msg = (f'{ano} é bissexto')
elif ano % 4 == 0 and not ano % 100 == 0:
    msg = (f'{ano} é bissexto')
else:
    msg = (f'{ano} não é bissexto')
print(msg)
    
