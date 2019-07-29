n=int(input())
s = input()
index=-1;
for i in range(n-1):
        if(s[i]>s[i+1]):
                index=i;
if(index==-1):
    print("NO");
else:
    print("YES\n",(index+1),(index+2));