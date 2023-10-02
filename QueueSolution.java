class QueueUsingArray{
    int front_Q,rear_Q;
    int capacityOfQueue;
    static int[]q1;
   // constructor
    QueueUsingArray(int size){
        capacityOfQueue=size;
        q1=new int[capacityOfQueue];
    }
    //enqueue -  inserting of elements 
    void enqueue(int value){
        if (rear_Q==capacityOfQueue){
            System.out.println("queue is fulled");
        }
        else{
            q1[rear_Q]=value;
            rear_Q++;
        }

    }
    // dequeue -  deleting of element in front 
    void dequeue(){
        if(rear_Q==0){
            System.out.println("queue is empty");
        }
        else{
            for(int i=0;i<rear_Q-1;i++){
                q1[i]=q1[i+1];
            }
            rear_Q--;
        }
    }
    //display - displaying front and rear elements 
    void display(){
        if(rear_Q==0){
            System.out.println(("queue is empty"));
        }
        else{
            for(int i=0;i<rear_Q;i++){
                System.out.print(q1[i]+"  ");
        }

    }
} }
// main class
public class QueueSolution {
    public static void main(String[]args){
        QueueUsingArray q2 = new QueueUsingArray(5);
        q2.enqueue(3);
        q2.enqueue(5);
        q2.enqueue(4);
        q2.display();
        q2.dequeue();
        System.out.println();
        q2.display();
    }
    
}
