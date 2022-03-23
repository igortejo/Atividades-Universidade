def ultimo_nome(nomecompleto):
    sobrenome = ""
    nomes = []
    for i in range(len(nomecompleto)):
        if nomecompleto[i] != " ":
            sobrenome += nomecompleto[i]
        else:
            nomes.append(sobrenome)
            sobrenome = ""
    nomes.append(sobrenome)
    return nomes[-1]

def fmt_citacao(autores):
    nomes_formatados = []
    for nome in autores:
        nomes_formatados.append(ultimo_nome(nome))
    lista = []
    for n in range(len(nomes_formatados)):
        c = nomes_formatados[n] + ", " + autores[n][0] + "."
        lista.append(c)
    return lista

autores = ['Machado de Assis', 'João Cabral de Melo Neto', 'Graciliano Ramos','Guimarães Rosa']

assert ultimo_nome(autores[1]) == 'Neto'
assert ultimo_nome(autores[2]) == 'Ramos'
assert ultimo_nome(autores[3]) == 'Rosa'


#assert citacoes == ['Assis, M.', 'Neto, J.', 'Ramos, G.', 'Rosa, G.']
