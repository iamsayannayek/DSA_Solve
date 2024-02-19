package TheoryConcepts.Th6_OOPs.Inheritance;

class Vehicle{
    void showProperty(){
        System.out.println("I'm a vehicle class");
    }
}
//When we inherit the property of parent class by using 'extends' keyword it's called IS-A Relationship
public class Ch1_SingleInheritance extends Vehicle{
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.showProperty();
    }
}

