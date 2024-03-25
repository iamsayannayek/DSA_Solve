package TheoryConcepts.Ch2_LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();

        //Insert the element from the First
        list.insertAtFirst(5);
        list.insertAtFirst(4);
        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.display();

        list.insertRecursion(55, 3);

        list.display();

//        //Insert element from the last
//        list.insertLast(11);
//
//        //Insert at specific index position
//        list.insertAtIndex(100, 4);
//
//        list.display();
//
//        System.out.println();
//        //Delete from the first
//        System.out.println("Delete from the first:");
//        System.out.println("Remove Element is: " + list.deleteFirst());
//
//        list.display();
//
//        System.out.println();
//        //Delete from the last
//        System.out.println("Delete from the last:");
//        System.out.println("Remove Element is: " + list.deleteLast());
//
//        list.display();
//
//        System.out.println();
//        //Delete By Index value
//        System.out.println("Delete By Index value:");
//        System.out.println("Remove Element is: " + list.deleteByIndex(3));
//
//        list.display();
//
//        DoublyLL list = new DoublyLL();
//        list.insertAtFirst(5);
//        list.insertAtFirst(4);
//        list.insertAtFirst(3);
//        list.insertAtFirst(2);
//        list.insertAtFirst(1);
//
//        //Insert after given value
////        list.insertAfterValue(0, 7);
//        System.out.println("Before reverse: ");
//        list.display();
//
//        System.out.println();
//
//        System.out.println("After Reverse:");
//        list.reverseDLL();
//        list.display();

    }
}
