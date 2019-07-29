def gcd(a,b):
    if(a==0):
        return b;
    return gcd(b%a,a)
def lcm(a,b):
    return (a*b)/gcd(a,b)

n= int(input())
list = list(map(int,input().split()))
min=324324342343
firs=-1
second=-1
for i in range(n):
    for j in range(i+1,n):
        res=lcm(list[i],list[j])
        if(res<min):
            min=res
            firs=list[i]
            second=list[j]

print(firs,second)