package TheoryConcepts.Ch2_LinkedList;

public class Main {
    public static void main(String[] args) {
        //Single LinkedList
//        LL list = new LL();
//
//        //Insert value at First
//        list.insertFirst(12);
//        list.insertFirst(11);
//        list.insertFirst(10);
//        list.insertFirst(9);
//        list.insertFirst(8);
//        list.insertFirst(7);
//
//        //Insert value at Last
//        list.insertLast(99);
//
//        //Insert at Given Position
//        list.insertAtIndex(999, 3);
//
//        list.display();
//
//        //Delete the first element
//        System.out.println("The deleted element is -> " + list.deleteFirst());
//        list.display();
//
//        //Delete the Last element
//        System.out.println("The deleted element is -> " + list.deleteLast());
//        list.display();
//
//        //Delete the element at Position
//        System.out.println("The deleted element is -> " + list.deleteAtIndex(2));
//        list.display();

        //Doubly LinkedList
        DoublyLL list = new DoublyLL();

        //Insert value at First
        list.insertFirst(12);
        list.insertFirst(11);
        list.insertFirst(10);
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);

        //Insert at last position
        list.insertLast(99);

        //Insert element after Define element
        list.insertAfterElement(10, 555);

        //Display in Forward Direction
        list.display();
        System.out.println("Reverse: ");

        //Display in Reverse Direction
//        list.displayRev();

    }
}
