import datetime

# leitura e pre-processamento de dados da entrada
linha_data = open("data.txt").readline()
dia = int(linha_data[0:2])
mes = int(linha_data[3:5])
ano = int(linha_data[6:10])
data = datetime.date(ano, mes, dia)

# calculo do número de dias
hoje = datetime.date.today()
delta = hoje - data
dias = delta.days

# pós-processamento e saída
print(f"Dias desde {linha_data.strip()}: {dias} dias")
