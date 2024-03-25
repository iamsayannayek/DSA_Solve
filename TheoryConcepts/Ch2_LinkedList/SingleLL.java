package TheoryConcepts.Ch2_LinkedList;

public class SingleLL {
    private Node head;
    private Node tail;
    private int size;
    public SingleLL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //Give the reference of any node by indexing value
    public Node getNode(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public Node findNodeByValue(int val){
        Node node = head;
        while(node!=null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Insertion in Single LL
    public void insertAtFirst(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertAtFirst(val);
            return;
        }

        tail.next = node;
        tail = node;
        size++;

    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertAtFirst(val);
        }

        if(index == size){
            insertLast(val);
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //Insert a element at given index using Recursion
    public void insertRecursion(int val, int index){
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index-1, node.next);
        return node;
    }

    //Deletion in Single LL
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val = tail.value;

        Node secondLast = getNode(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteByIndex(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = getNode(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
