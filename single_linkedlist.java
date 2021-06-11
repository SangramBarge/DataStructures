//creating class for node
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
    //geekforgeeks question
    public void moveLastToFront(){
        Node last = head;
        Node secondLast=null; 
        while(last.next !=null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next=null;
        last.next = head;
        head = last;
   }
    
    public void printList(){
     Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void deleteWithValue(int data){
        if(head ==null) return;
        if(head.data==data){
            head = head.next;
            return;
           
        }
        Node current = head;
        while(current.next!=null){
            if(current.next.data ==data){
                current.next = current.next.next;
                return;
            }
            current =current.next;
        }
    }

public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list.append(3);
    list.append(2);
    list.append(1);
    list.printList();
    list.moveLastToFront();
    //list.deleteWithValue(1);
    list.printList();
    
}
}
