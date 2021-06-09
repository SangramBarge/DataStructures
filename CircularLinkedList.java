class Node{
    int data;
    Node next = null;
    public Node(int data){
        this.data= data;
    }    
}

class CircularLinkedList{
    Node head,temp;
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = temp = newNode;
        }else{
            temp.next = newNode;
            temp = newNode;
        }
        temp.next = head;
        
       
    }
    public void printList(){
     Node current = head;
        while(current.next != head) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
    
    public static void main(String args[]){
        CircularLinkedList list = new CircularLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
         list.append(4);
        list.printList();
    }
    
}
