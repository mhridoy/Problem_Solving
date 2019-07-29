# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.

while True:
        try:
            array= [(x) for x in input().split()]
            a= array[0];
            b=array[1];
            if(a=="0" and b=="0"):
                break;
            count=0;
            increment=0;
            min_ = min(len(a),len(b))
            for i in range(min_-1,-1,-1):
                sum_= int(a[i])+int(b[i])+increment
                increment=0
                if(sum_>=10):
                    count+=1;
                    increment=1







            print("No carry operation.") if(count==0) else print("%d carry operations."%count)
        except EOFError:
            break