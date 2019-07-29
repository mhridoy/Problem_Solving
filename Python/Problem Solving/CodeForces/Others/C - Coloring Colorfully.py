
paint = input();
cout=0;
dout=0;
if(paint[0]=='0'): #000
    temp=""
    for i in range(len(paint)):
        if(i%2!=0):
            temp+='1';
            cout+=1;
        else : temp+=paint[i]
    print(temp)
    for j in range(len(paint)-1):
        if(temp[j]==temp[j+1]):
            cout+=1;
    print(cout) if len(paint)==1 else print(cout)
else:
    temp=""
    semp=""
    for i in range(len(paint)):
        if(i%2!=0):
            if(paint[i-1]=='1'and paint[i]=='0'):
                temp+='1'
                cout += 1;
            else :temp+='0'

        else : temp+=paint[i]
    for i in range(len(paint)-1):
        if(paint[i]==paint[i+1]):
            if(paint[i]=='0'):
                semp+='1'
                dout += 1;
            else :
                semp+='0'
                dout+=1
        else :semp+=paint[i]


    print(temp)
    print(semp)
    for j in range(len(paint)-1):
        if(temp[j]==temp[j+1]):
            cout+=1;
    print(cout) if len(paint)==1 else print(cout)
#print(white)