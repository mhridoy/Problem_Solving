


def is_arithmetic(l,test):
        delta = 0 if (len(l)<=1)  else (l[test-1] - l[test-2])
        for index in range(test-1,0,-1):
            if  (l[index -1 ] + delta != l[index]):
             return index+1;
        return 1;
#from sys import stdin
#lines = stdin.readlines()
#for line in lines:
while True:
        try:
            test = int(input())
            array = list(map(int, input().split()))
            print(is_arithmetic(array, test))
        except EOFError:
            break




