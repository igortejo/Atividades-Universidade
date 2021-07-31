reprovados = 0

while True:
    entrada = input()
    if entrada == "-":
        break

    faltas = 0
    i = 0
    while i < len(entrada):
        if entrada[i] == "f":
            faltas += 1
            if faltas >  8:
                reprovados += 1
                break
        i += 1

print(f'{reprovados} aluno(s) reprovado(s) por falta.')				
			
	
	
