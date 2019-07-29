# def is_arithmetic(l,test):
#     if(len(l) <=1):return 0;
#     else:
#         delta = l[test-1] - l[test-2]
#         for index in range(len(l)-1,-1,-1):
#             if  (l[index -1 ] + delta != l[index]):
#              return index+1;
#         return 1;
#
# while True:
#         try:
#
#             test= int(input());
#             array = list(map(int, input().split()))
#             print(is_arithmetic(array, test))
#         except EOFError:
#             break
test = int(input())

for i in range(1,test+1):
	diameter,distance,height = (input().split())
	ans = abs(float(distance)-float(height));
	if(ans<float(diameter)):
		print("Case %d: Yes"%(i))
	else :
            print("Case %d: No"%(i))
