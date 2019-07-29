# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.

def TwoThePowersum (n,sum):
    pow2 = 1;
    iterate= 0;
    while (pow2 <= n):
            sum =sum- 2**iterate;
            pow2 =2**iterate;
            iterate+=1;
    return sum;
test = int(input())
#print("Allahumma Salli Alla ")
for i in range(test):
    number = int(input())
    sum= (number*(number+1))//2
    ans = TwoThePowersum(number,sum);
    print(ans+1)