def quanto_tempo(horario1, horario2):
	hora1 = horario1[0] + horario1[1]
	minuto1 = horario1[3] + horario1[4] 
	hora2 = horario2[0] + horario2[1]
	minuto2 = horario2[3] + horario2[4] 
	hora_final = (((int(hora2)*60) + int(minuto2)) - ((int(hora1)*60) + int(minuto1)))

	hora = hora_final // 60
	minuto = hora_final % 60
	resultado =  str(hora) + ' hora(s) e ' + str(minuto)+ ' minuto(s)'
	return resultado

print(quanto_tempo('00:00', '23:59'))
#assert quanto_tempo("07:15", "09:18") == "2 hora(s) e 3 minuto(s)"
