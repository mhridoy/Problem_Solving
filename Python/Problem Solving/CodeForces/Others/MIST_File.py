


test = int(input())
index=1;
while test>0:
    n = int(input())
    array = list(map(int, input().split()))
    temp="";
    flag = True;
    for i in range(n):
        if(array[i]%2==0):
            temp+='1'
            flag=False
        elif (flag==False):
            temp+='0';
    print("Case %d: %s" %(index,temp))
    test-=1
    index+=1;

