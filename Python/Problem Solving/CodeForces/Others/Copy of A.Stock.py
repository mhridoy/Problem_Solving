list = [int (x) for x in input().split()]
n = list[0]
m = list[1]
r = list[2]
array = [int (x) for x in input().split()]
array_= [int (x) for x in input().split()]
array.sort()
array_.sort()
c = r//array[0]
o = r
r%=array[0]
r+=c*array_[m-1]
print(max(o,r))