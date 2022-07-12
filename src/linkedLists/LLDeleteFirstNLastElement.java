package linkedLists;

public class LLDeleteFirstNLastElement {
    Node head;

    class Node{
        Integer data;
        Node next;
        Node(Integer data){
            this.data = data;
            next = null;
        }
    }

    public void addFirst(Integer data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head =  newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("The List is Empty.");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is Empty.");
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is Empty.");
            return;
        }
        if(head.next == null){
            head = null;
        }
        else {
            Node lastNode = head.next;
            Node secondLastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }
    }
    public static void main(String[] args) {
        LLDeleteFirstNLastElement ll = new LLDeleteFirstNLastElement();
//        Adding Nodes to LinkedList
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(17);
        ll.addFirst(11);
        ll.addFirst(19);
        ll.addFirst(20);

        System.out.println("Original Linked List:");
        ll.printList();
        System.out.println(" ");
        System.out.println("First Element Deleted Linked List:");
        ll.deleteFirst();
        ll.printList();
        System.out.println(" ");
        System.out.println("First and Last Element Deleted Linked List");
        ll.deleteLast();
        ll.printList();


    }
}
