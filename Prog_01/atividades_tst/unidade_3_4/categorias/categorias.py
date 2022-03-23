nome = input()
idade = int(input())
if 5 <= idade <= 7:
    msg = 'Infantil A.'
elif 8 <= idade <= 10:
    msg = 'Infantil B.'
elif 11 <= idade <= 13:
    msg = 'Juvenil A.'
elif 14 <= idade <= 17:
    msg = 'Juvenil B.'
elif idade > 17:
    msg = 'Senior.'
else: 
    msg = 'Não pode competir.'
print(f'{nome}, {idade} anos, {msg}')
