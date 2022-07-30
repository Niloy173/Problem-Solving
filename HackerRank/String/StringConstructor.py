from collections import Counter
case = int(input())
for i in range(case):

    s1 = input()
    s2 = input()

    dic1 = Counter(s1)
    dic2 = Counter(s2)

    common = dic1 & dic2
    #commonpart = list(common.elements())

    if(len(common)==0):
        print('NO')
    else:
        print('YES')

    
