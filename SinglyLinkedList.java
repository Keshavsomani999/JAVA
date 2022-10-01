public class SinglyLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node current = head;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("Node of singly linked list : ");
        while(current != null){
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.addNode(22);
        sList.addNode(33);
        sList.addNode(55);
        sList.addNode(88);
        sList.display();
    }
}
