# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.



test = int(input())
for i in range(1,test+1):
             number = int(input())
             a=0;
             b=0;
             c =0;
             d =0;
             count=0;
             for j in range(2,number):
                if number%j==0:
                            if(count==0):
                                a = j;
                                b =number//j;
                            else:
                                c=j;
                                d=number//j;
                                break;
                            count+=1
             print("Case #%d: %d = %d * %d = %d * %d"%(i,number,a,b,c,d));