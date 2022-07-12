package linkedLists;

public class LinkedListSize {
    Node head;
    private int size;

    LinkedListSize(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        Node currentNode = head;
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printLinkedList(){
        Node currentNode = head;
        if(head == null){
            System.out.println("The List is empty.");
            return;
        }
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }

    public int calcSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListSize ll = new LinkedListSize();
        ll.addLast("I");
        ll.addLast("am");
        ll.addLast("Happy");
        ll.printLinkedList();
        System.out.println("");
        System.out.println("The Size of Linked List is: "+ll.calcSize()+".");
    }
}
