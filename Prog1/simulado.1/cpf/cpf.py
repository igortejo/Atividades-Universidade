cpf_1 = int(input())
cpf_2 = int(input())
cpf_3 = int(input())

cpf1_1 = cpf_1 // 10 % 10
cpf1_2 = cpf_1 % 10

cpf2_1 = cpf_2 // 10 % 10
cpf2_2 = cpf_2 % 10

cpf3_1 = cpf_3 // 10 % 10
cpf3_2 = cpf_3 % 10

parte_cpf1 = cpf_1 // 100
parte_cpf2 = cpf_2 // 100
parte_cpf3 = cpf_3 // 100

soma_cpf1 = cpf1_1 + cpf1_2
soma_cpf2 = cpf2_1 + cpf2_2
soma_cpf3 = cpf3_1 + cpf3_2

print(f"{parte_cpf1}-{cpf1_1}{cpf1_2}")
print(soma_cpf1)
print(f"{parte_cpf2}-{cpf2_1}{cpf2_2}")
print(soma_cpf2)
print(f"{parte_cpf3}-{cpf3_1}{cpf3_2}")
print(soma_cpf3)
