list = list(map(int,input().split()))
n=list[0]
a = list[1]
b=list[2]
s=0;
max=b;
if(not a and not b):print(s)
else:
    f = [int(x) for x in input().split()]
    for i in range(n):

        if(f[i]):
            if(a>0 and b<max):
                b+=1
                a=a-1
            else: b=b-1
        else:
            if(b>0):b=b-1
            else : a=a-1
        s=s+1;
    print(s)