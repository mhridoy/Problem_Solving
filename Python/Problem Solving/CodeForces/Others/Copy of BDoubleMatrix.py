# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
input_=[int (x) for x in input().split()]
n = input_[0]
m = input_[1]
a = []
b = []

for i in range(n):
    a.append([int(k) for k in input().split()])
for i in range(n):
    b.append([int(k) for k in input().split()])
flag =False
for i in range(0,n-1):
    for j in range(0,m-1):
        if (a[i][j] >= a[i][j + 1] and b[i][j] >= a[i][j + 1]):
                    print("Impossible");
                    flag=True
                    break
        if (a[i][j] >= a[i + 1][j] and b[i][j] >= a[i + 1][j]):
            print("Impossible");
            flag = True
            break
        if (b[i][j] >= b[i][j + 1] and a[i][j] >= b[i][j + 1]):
            print("Impossible");
            flag=True
            break
        if (b[i][j] >= b[i + 1][j] and a[i][j] >= b[i + 1][j]):
                print("Impossible");
                flag=True
                break
    if(flag):break

if(not flag): print("Possible")