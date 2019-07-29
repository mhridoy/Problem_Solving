# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
n = int(input())
a = [int (x) for x in input().split()]
odd=0
#even=0
#a.append(0)
for i in range(0,n):
    if(a[i]==1):
        odd+=1
#print(odd)
even=n-odd
if(even>0):
    print("2",end=' ')
    even=even-1
#print(even)
if(odd>0):
    print("1",end=' ')
    odd=odd-1
#print(odd)
for i in range(0,even):
        print("2",end=' ')
for i in range(0,odd):
        print("1",end=' ')