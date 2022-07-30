case = int(input())
def check_for_deletion(val):
    length = len(val)
    count=0
    for i in range(1,length):
        if val[i] == val[i-1]:
            count+=1
    return count
        
        
for _ in range(case):

    val = input()
    s = check_for_deletion(val)
    print(''+str(s))
