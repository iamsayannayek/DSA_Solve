package TheoryConcepts.Ch2_LinkedList;

public class DoublyLL {
    private Node head;

    public void insertAtFirst(int val){
        Node node = new Node(val);

        node.prev = null;
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node findNodeByValue(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfterValue(int after, int val){
        Node p = findNodeByValue(after);
        if(p==null){
            System.out.println("Doesn't exist the value in lInkedList");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void reverseDLL(){
        if(head == null || head.next == null){
            return;
        }
        Node current = head;
        Node last = null;

        while(current!=null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;

            current = current.prev;
        }
        head = last.prev;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " --> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

//        while(last!=null){
//            System.out.print(last.value + " --> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
