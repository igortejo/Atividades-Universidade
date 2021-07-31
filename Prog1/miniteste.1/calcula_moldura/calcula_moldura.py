medida_comprimento = float(input())
medida_largura = float(input())
comprimento_total = 2 * medida_comprimento + 2 * medida_largura
comprimento_final = comprimento_total / 100
preco_final = 120 * comprimento_final
print(f"R$ {preco_final:.1f}")
