if __name__ == '__main__':
    n = int(raw_input())
    arr = list(map(int, raw_input().split()))[:n]
    
    max_ = max(arr)
    l = []
    
    for i in arr:
       if i != max_:
        l.append(i)
        
    second_max = max(l)
    
    print(''+str(second_max))
        
    

