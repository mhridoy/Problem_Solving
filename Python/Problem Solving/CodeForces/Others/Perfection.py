

array = [int (x) for x in input().split()]


def check(x):
    sum=0
    div=int(x/2)
    for i in range(1,div+1):
        if x%i==0:
            sum+=i;
    return sum
print("PERFECTION OUTPUT")
for i in range(len(array)-1):
    x= array[i];
    if(check(x)==x):
        print("%5d  PERFECT"%x);
    elif (check(x)<x):
        print("%5d  DEFICIENT"%x);
    elif(check(x)>x):
        print("%5d  ABUNDANT"%x)
print("END OF OUTPUT")
