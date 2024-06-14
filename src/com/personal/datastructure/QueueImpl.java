package com.personal.datastructure;

public class QueueImpl {
    int size;
    int front;
    int rear;
    int items[];
    QueueImpl(int size){
        items = new int[size];
        this.size=size;
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        if (front == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(front == 0 && rear == size-1){
            return true;
        }
        else return false;
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        } else {
            if (front == -1 ) {
                front = 0;
            }

            rear++;
            items[rear]=element;
        }
    }

    public int dequeue(){
        int element;
        if(isEmpty()){
            System.err.println("Queue Empty, No Values to remove");
            return -1;
        }
        else {
            element =  items[front];

            //remove first element
            if(front >= rear){
                front = -1;
                rear = -1;
            }else {
                front++;
            }
            System.out.println("Dequeued:"+element);
            return element;
        }

    }

    public void listQueue(){
        if (isEmpty()){
            System.err.println("Queue Empty");
        }
        System.out.println("Front Index:"+ front);
        System.out.println("Rear Index:"+ rear);

        System.out.println("Length of arrary:"+items.length);
        for(  int i = front; i <= rear; i++)
            System.out.println(items[i]);

    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(5);
        int[] ar = {1,2,3,4,5};
        for (int i = 0 ; i < 5; i++ ){
            queue.enqueue(i);
        }
        queue.listQueue();
        queue.enqueue(4);
        queue.dequeue();
        queue.listQueue();
    }
}
