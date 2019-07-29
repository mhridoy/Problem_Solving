def check(c,array):
    flag = False
    for i in range(len(array)):
            temp = array[i]

            if(c==temp[0]):
                print(temp)
                array[i]="0"
                flag=True
                break

    if(not flag):
        print("Already Mastered")

test = int(input())
for i in range(test):
    N = int(input())
    dictionary =[]
    for i in range(N):
        dictionary.append(input())
    dictionary.sort();
    #print(dictionary)
    Q = int(input())
    for i in range(Q):
        line = list(map(str,input().split()))
        c = line[0]
        check(c,dictionary)