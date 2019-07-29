

test = int(input())
for i in range(test):
    letter = input();
    flag = True;
    temp =''.join(sorted(letter));
    #print(temp)
    for i in range(len(letter)-1):
        if((temp[i]<temp[i+1]) and (abs(ord(temp[i])-ord(temp[i+1]))==1)):
            flag=True;
        else :
            flag=False;
            break
    if(flag):print("YES")
    else: print("No");