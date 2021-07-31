n1 = int(input())
n2 = int(input())
if n1 > n2:
    print('---')
else:
    for c in range(n1, n2 + 1):
        print(c, c**2)
