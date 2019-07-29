# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
arr = [int (x) for x in input().split()]
x = arr[0]
y = arr[1]

if(y%x==0):print(0)
else :
    min_chocolate =0;
    for i in range(1,151,1):
        if((y+i)%x==0):
            min_chocolate=i;
            break
    print(min_chocolate)