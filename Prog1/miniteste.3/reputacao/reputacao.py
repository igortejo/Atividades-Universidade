nome1 = input()
rep1 = int(input())
nome2 = input()
rep2 = int(input())
nome3 = input()
rep3 = int(input())
if rep1 > rep2 and rep1 > rep3 and rep2 > rep3:
    msg = nome1, nome2, nome3
elif rep1 > rep2 and rep1 > rep3 and rep3 > rep2:
    msg = nome1, nome3, nome2
elif rep2 > rep1 and rep2 > rep3 and rep1 > rep3:
    msg = nome2, nome1, nome3
elif rep2 > rep1 and rep2 > rep3 and rep3 > rep1:
    msg = nome2, nome3, nome1
elif rep3 > rep1 and rep3 > rep2 and rep1 > rep2:
    msg = nome3, nome1, nome2
elif rep3 > rep1 and rep3 > rep2 and rep2 > rep1:
    msg = nome3, nome2, nome1
elif rep1 == rep2 and rep1 == rep3:
    msg = nome1, nome2, nome3
elif rep1 == rep2 and rep1 > rep3:
    msg = nome1, nome2, nome3
elif rep1 == rep2 and rep1 < rep3:
    msg = nome3, nome1, nome2
elif rep1 == rep3 and rep1 > rep2:
    msg = nome1, nome3, nome2
elif rep1 == rep3 and rep1 < rep2:
    msg = nome2, nome1, nome3
elif rep2 == rep3 and rep2 > rep1:
    msg = nome2, nome3, nome1
elif rep2 == rep3 and rep2 < rep1:
    msg = nome1, nome2, nome3
print(msg[0])
print(msg[1])
print(msg[2])
