package TheoryConcepts.Th6_OOPs.Inheritance;

class Amiba{
    void callAmiba(){
        System.out.println("I'm the first animal on the earth");
    }
}
class Gorila extends Amiba{
    void callGorila(){
        System.out.println("I'm the before animal of the today's modern human");
    }
}
public class Ch2_MultilevelInheritance extends Gorila{
    public static void main(String[] args) {
        Gorila man = new Gorila();
        man.callAmiba();
        man.callGorila();

    }
}
