import math
print("Cálculo da Superfície de um Cilindro")
d = float(input())
a = float(input())
print("---")
diametro = print("Medida do diâmetro? {:.2f}".format(d))
altura = print("Medida da altura? {:.2f}".format(a))
print("---")
calculo_area_base =  2 * (math.pi * ((d/2) ** 2)) 
calculo_area_lateral = (2 *( math.pi * (d/2))) * a
area_total = calculo_area_base + calculo_area_lateral
print("Área calculada: {:.2f}".format(area_total))

