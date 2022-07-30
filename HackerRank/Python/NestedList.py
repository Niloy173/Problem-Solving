n = int(input())
a = []
scores = set()
for i in range(0,n):
    name = input()
    score = float(input())
    a.append([name,score])
    scores.add(score)

second_high = sorted(scores)[1]
second = []

for name ,value in a:
    if value == second_high:
        second.append(name)

for i in sorted(second):
    print(i)
