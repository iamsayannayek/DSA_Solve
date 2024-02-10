package TheoryConcepts.Th6_OOPs;

public class Ch1_LearnObjectClassMethods {
    public static void main(String[] args) {
        Animal buzo = new Animal();
        //Object Initialization By -->
        //Method 1: By Reference Variable
//        buzo.color = "Black";
//        buzo.age = 10;

        //Method 2: By using Method()
        buzo.initObj("black", 10);
        buzo.display();
    }
}

class Animal{
    String color;
    int age;

    void initObj(String c, int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color + " " + age);
    }
}
