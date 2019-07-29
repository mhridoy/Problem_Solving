# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
test = [int (x)for x in input().split()]
n = test[0]
m = test[1]
a = [int (x)for x in input().split()]
b = [int (x)for x in input().split()]
odd=0;
odd1=0
even=0
even1=0
for i in range(n):
    if(a[i]%2==0):even+=1
    else: odd+=1
for i in range(m):
    if(b[i]%2==0):even1+=1
    else: odd1+=1
print(min(odd,even1)+min(even,odd1))