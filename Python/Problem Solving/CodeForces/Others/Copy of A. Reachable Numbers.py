# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
def func(x ):
    x+=1
    while x%10==0:
        x/=10;
    return x;
x = int(input())
s=set();
while (not s.__contains__(x)):
    s.add(x)
    x=func(x)
print(s.__len__())