salario_bruto = float(input())
horas_trabalhadas = int(input())
hora_bruta = salario_bruto / horas_trabalhadas
print("Salário Bruto = {:.2f}".format(salario_bruto))
print("Hora Bruta = {:.2f}".format(hora_bruta))
IR = 0.11 * salario_bruto
print("Desconto IR = {:.2f}".format(IR))
INSS = 0.08 * salario_bruto
print("Desconto INSS = {:.2f}".format(INSS))
SINDICATO = 0.05 * salario_bruto
print("Desconto Sindicato = {:.2f}".format(SINDICATO))
SALARIO_LIQUIDO = salario_bruto - (IR +INSS + SINDICATO)
print("Salário Líquido = {:.2f}".format(SALARIO_LIQUIDO))
HORA_LIQUIDA = SALARIO_LIQUIDO / horas_trabalhadas
print("Hora Líquida = {:.2f}".format(HORA_LIQUIDA))

