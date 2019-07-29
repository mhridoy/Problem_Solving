

list_ = list(map(int,input().split()))
n = list_[0]
t = list_[1]
index=0;
min = 4168416461;
ss=[]
dd=[]
k=1
for i in range (n):
    array = list(map(int,input().split()))
    ss[i] = array[0]
    dd[i] = array[1]
for i in range(n):
    if (t <= ss[i]):
        route = i + 1;
        break;
    else :
        for j in range (n):
            if (t <=ss[j] +dd[j] * k) :
                route = j + 1;
                k+=1;
                break
print(route)




print(index+1)