//circular queue implementation in java
public class QueueImpl {
    int capacity=5;
    int rear;
    int front;
    int queue[] = new int[capacity];
    
    public QueueImpl(){
        this.rear = -1;
        this.front = -1;       
    }
    
    //adding to queue
    public void enqueue(int data){
        //check if full
        if(front == -1 && rear == -1){
            front =0;
            rear =0;
            queue[rear] = data;
        } else if( rear +1 % capacity ==front){
            System.out.println("Queue is full");
        } else{
            rear = rear +1 %capacity;
            queue[rear] = data;
        }
    }
    
    //deleting from queue
    public void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is empty");
        } else if(front == rear){
            front =-1;
            rear = -1;
        } else {
            System.out.println("Dequeued element is "+queue[front]);
            front = front +1 % capacity;
        }
    }

    //display the queue
    public void display(){
        int i = front;
        if(front == -1 && rear ==-1 ){
            System.out.println("queue is empty");
        } else{
            while(i != rear){
                System.out.println(queue[i]);
                i= i+1 % capacity;
            }
             System.out.println(queue[rear]);
        }
    }
    
    public static void main(String[] args) {
        QueueImpl q = new QueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        q.dequeue();
        q.display();
        
    }
}