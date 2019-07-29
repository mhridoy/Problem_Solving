
List = list(map(str,input().split()))
a = List[0]
b = List[1]
n = int(input())
kill= []
replace =[]
for i in range(n):
    Killer = list(map(str,input().split()))
    c = Killer[0]
    d= Killer[1]
    #print(a,b)
    kill.append(a)
    replace.append(b)
    if(c==a):a=d
    else: b=d;
for i in range(n):
    print(kill[i],replace[i])
print(a,b)
