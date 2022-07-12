package linkedLists;

public class LL {
    Node head;

    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head =  newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void printList(){
        if(head == null){
            System.out.println("The List is Empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");

    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst("Hello");
        ll.addLast("Friends!");
        ll.printList();
    }
}
