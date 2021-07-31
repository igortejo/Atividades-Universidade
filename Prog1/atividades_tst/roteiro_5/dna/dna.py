s1 = input()
s2 = input()
s3 = input()
if len(s1) < len(s2) and len(s1) < len(s3):
    msg = s1
elif len(s2) < len(s1) and len(s2) < len(s3):
    msg = s2
elif len(s3) < len(s1) and len(s3) < len(s2):
    msg = s3
elif len(s1) == len(s2) and len(s1) == len(s3):
    msg = s1
elif len(s1) == len(s2) and len(s1) < len(s3):
    msg = s1
elif len(s1) == len(s3) and len(s1) < len(s2):
    msg = s1
elif len(s2) == len(s3) and len(s2) < len(s1):
    msg = s2
print(msg, len(msg))

