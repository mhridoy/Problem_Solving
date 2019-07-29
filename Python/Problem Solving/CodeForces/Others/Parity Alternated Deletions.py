def check(n):
    True if n%2==0 else False;

test = int(input())
array = list(map(int,input().split()))
initial = array[0]
previous = check(initial);
array[0]=0;


def playgame(array, previous, j):
    for i in range(j,len(array)):
        if(previous):
            if(array[i]%2==0):
                array[i]=0;
                return True;
        else:
            if(array[i]%2!=0):
                array[i]=0;
                return True;
    return False;


for i in range(1,test):
    if(previous!=check(array[i])):
       check_check= playgame(array,previous,i);
       previous=array[i];
       if(check_check):continue;
       else : break;
sum=0;
for i in range(test):
    sum+=array[i];
print(sum);