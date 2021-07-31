preco_tijolo = float(input("Digite o preço da unidade do tijolo (Em reais): "))
altura_tijolo = float(input("Digite a altura do tijolo (Em metros): "))
comprimento_tijolo = float(input("Digite o comprimento do tijolo (Em metros): "))
altura_parede = float(input("Digite a altura das paredes (Em metros): "))
comprimento_paredes = float(input("Digite o comprimento das paredes (Em metros): "))
total_tijolos = (altura_parede * comprimento_paredes) / (altura_tijolo * comprimento_tijolo)
valor_tijolo_total = total_tijolos * preco_tijolo 
print("O número total de tijolos é {:.1f} e o orçamento final é de R$ {:.1f}".format(total_tijolos,valor_tijolo_total))

