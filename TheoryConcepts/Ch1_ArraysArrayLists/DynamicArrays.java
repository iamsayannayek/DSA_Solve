package TheoryConcepts.Ch1_ArraysArrayLists;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        //Syntax of ArrayList
        ArrayList<Integer> list = new ArrayList<>(10);
        // Addition of Elements in ArrayList
        list.add(12);
        list.add(32);
        list.add(7);
        list.add(98);

        //Some important methods
        System.out.println(list.contains(98)); //Output: true; check it's here or not

        System.out.println(list.set(0, 99)); //Updated the list by index
        //Output: [99, 32, 7, 98]

        System.out.println(list.remove(2)); //Remove element by index value
        // Output: [99, 32, 98]

        System.out.println(list.get(1)); //Get element by index value
        // Output: 32

        
    }
}
