
list = list(map(int,input().split(" ")))
if(list[0]>list[1]):
    max= max(list[0]+list[1],list[0]+(list[0]-1))
    print(max)
else :
    max = max(list[0] + list[1], list[1] + (list[1] - 1))
    print(max)