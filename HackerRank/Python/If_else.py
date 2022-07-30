x = int(input(""))

if x % 2 == 1 :
    print("Weird")
elif x%2 ==0 and x in range(2,5):
    print("Not Weird")
elif x%2 ==0 and (x >=6 and x<=20):
    print("Weird")
elif x%2==0 and x > 20:
    print("Not Weird")