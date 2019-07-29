n= int(input())
output=0
if(n%2==1):
    output=0;

else:
    n=n//2;
    output=1<<n
print(output)