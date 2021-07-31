cre = float(input())
experiencia = int(input())
nota_entrevista = float(input())
if cre < 7 and experiencia < 6:
    msg = 'Candidato eliminado. CRE e experiência abaixo do limite.'
elif cre < 7 and experiencia >= 6:
    msg = 'Candidato eliminado. CRE abaixo do limite.'
elif cre >= 7 and experiencia < 6:
    msg = 'Candidato eliminado. Experiência abaixo do limite.'
elif cre >= 7 and experiencia >= 6 and nota_entrevista <= 3:
    msg = 'Candidato classificado.'
else: # cre >= 7 and experiencia >= 6 and nota_entrevista > 3:
    msg = 'Candidato aprovado.'
print(msg)
