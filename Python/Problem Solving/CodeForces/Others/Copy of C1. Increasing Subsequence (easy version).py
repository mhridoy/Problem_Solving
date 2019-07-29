# Allahumma SalliI Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Sal’laita Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.
# Allahumma Baarik Ala Muhammadiw Wa Ala Aali Muhammadin
# Kamaa Baarakta Ala Ibrahima Wa Ala Aali Ibrahima Inna’ka Hamidum Majid.

n = int(input())
array=[int (x) for x in input().split()]
l=0
r=n-1
cnt=0
curr=0
ans = []
an =[]
while(l<=r):
    if (array[l] < array[r]):
        if(len(an)==0 or array[l]>=an[len(an)-1]):
            an.append(array[l])
            l+=1
        elif(len(an) == 0 or array[r] >= an[len(an) - 1]):

                an.append(array[r])
                ans.append('R')
                r -=1;

        else:
            break;

    else:

        if (len(an) == 0 or array[r] >= an[len(an) - 1]):

            an.append(array[r]);
            ans.append('R');
            r-=1

        elif (len(an) == 0 or array[l] >= an[len(an) - 1]):

            an.append(array[l]);
            ans.append('L');
            l+=1;

        else:
            break;
print(len(ans))
for i in range(0,len(ans)):
    print(ans[i],end='')