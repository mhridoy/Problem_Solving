# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
def gcd (a,b):
    if (b != 0):
        return gcd(b, a % b);
    else:
        return a;
ii = [int (x) for x in input().split()]
n = ii[0]
m = ii[1]
get_gcd = 0;
array = [int (x)for x in input().split()]
crray =[int (x)for x in input().split()]
for i in range(n):
    if (i > 0):
        get_gcd = gcd(get_gcd, array[i]-array[i-1]);

flag = True;
for i in range(m):
    if (get_gcd % crray[i] == 0):
        print("YES");
        print(array[0],(i+1));
        flag=False
        break;

if( flag):
        print("NO");
