package CodeForces;

public class LifeToCode {
    public static void main(String[] args) {
        PersonWho m1 = new PersonWho(" Vaiya :P ",new int[]{1,2,3});
        PersonWho w1 = new PersonWho("Kake dibo !! Do u know her !!! :P",new int[]{3,2,1});
       // System.out.println(m1.toString()+" Pre[2]: "+m1.getPref(2));
        w1.errorWith(m1);
        PersonWho [] themen = new PersonWho[]{m1};
      PersonWho favw1=  w1.freeFavoriteIn(themen);
        w1.isFree();
        w1.setPartner(favw1);
        w1.errorWithPartner();

    }
}
class PersonWho {
    String name;
    int Pref[];
    PersonWho(String name,int getPref[])
    {
        this.name= name;
        this.Pref=getPref;
    }

    public String getName() {
        return name;
    }

    public int getPref(int n) {
        return Pref[n];
    }

    public void errorWith(PersonWho m1) {
        
    }

    public PersonWho freeFavoriteIn(PersonWho[] themen) {
        return null;
    }

    public void isFree() {
    }

    public void setPartner(PersonWho favw1) {
    }

    public void errorWithPartner() {
    }
}
class  DatingSession{
    PersonWho Men[];
    PersonWho Women[];
    DatingSession(PersonWho Men [], PersonWho Women[])
    {
        this.Men=Men;
        this.Women=Women;
    }
    public int totalError()
    {
        return 0;
    }
    public void assingPartners()
    {

    }
    public void sortAndAssign()
    {
        
    }
}


