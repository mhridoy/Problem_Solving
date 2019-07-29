test = int(input())
list = list(map(int, input().split()))
print(list)
list.sort()
a = list[-1] - list[0]
b = a//2 if a%2 == 0 else a

extra = b+list[0]
#print(extra)
flag = False
print(list[1:])
for i in list[1:]:
	if i+b != extra and i-b != extra and i!=extra:
		flag = True
		break
if flag:
	print(-1)
elif a % 2 == 0:
	print(a//2)
else:
	print(a)