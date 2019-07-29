n = int (input())
s = input()
ans=0
print("Hello");
for i in range(n):
    if int (s[i])%2==0:ans+=i+1;
print(ans)