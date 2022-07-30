
x = int(input())

dis = {}

for i in range(x):
    line = input().split()
    name,score =line[0], line[1:]
    score = list(map(float,score))
    dis[name]=score

z = input()

value = dis[z]

k =(sum(value)/ len(value))
print("%.2f" % round(k,2))
        


