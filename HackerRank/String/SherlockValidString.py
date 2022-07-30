from collections import Counter
data = Counter(input())
#print(data)
##dic = {}

def count_(val,data):
    c =0
    for i in data.values():
        if i==val:
            c+=1
    return c
        
def valid_checker(checker):
    max_ = max(checker.values())
    min_ = min(checker.values())
    

    if (len(set(data.values()))==1):
        return "YES"
    elif (len(set(data.values())) > 2):
        return "NO" # case - 123

    else:
        if count_(min_,data)==1:
            
            return "YES"
        if count_(max_,data)>1 or max_- min_>1: 
            return "NO"           # case = 4 2 2
        return "YES"
##def check(data):
##    
##    for i in data:
##        if i in dic:
##            dic[i] = dic[i]+1
##            
##        else:
##            dic[i]=1

##check(data)

result = valid_checker(data)
print(''+str(result))
