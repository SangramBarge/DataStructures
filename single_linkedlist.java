
class Node {
        int data; 
        Node next;
        
        public Node(int data){
            this.data = data;
        }
}  
public class Linkedlist {
    Node head;
        public void append(int data){
        if(head ==null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
            current.next = new Node(data);
        }
    
        public void prepend(int data){
            Node newHead = new Node(data);
            newHead.next = head;
            head = newHead;
        }
    
        public void printList(){
         Node current = head;
            while(current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.append(1);
        list.append(2);
        list.printList();
        list.prepend(0);
        list.printList();
        
    }
}







