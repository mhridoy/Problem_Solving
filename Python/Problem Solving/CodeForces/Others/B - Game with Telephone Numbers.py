# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
n = int(input())
a = input()
count=0;
bount =0;
for  i in range(n-10):
            if(a[i]=='8'):
                count+=1;
            else: bount+=1;

if(count>=bount):print("YES");
else :print("NO");