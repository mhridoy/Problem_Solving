list = list(map(int,input().split()))

#number of cats
n = list[0]
#number of cats who left the circle
m = list[1]

if(m==0) :print(1)
elif(m<=n//2):print(m)
else: print(n-m)