/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buwaneka De Silva
 */
public class QueueEX{
    private int maxSize;
    private int quearray[];//array
    private int rear;
    private int front;
    private int noItems;

public class QueueEX(int s){
    maxSize=s;
    quearray = new int[maxSize];
    front=0;
    rear=0;
    noItems=0;
}

public void enque(int j){
    quearray[++rear]=j;
    noItems++;
}

public void deque(int x){
    noItems--;
    return quearray[front++];
}

public int peekFront(){
    return quearray[front];
}

boolean isEmpty(){
    return (noItems==0);
}
boolean isFull(){
    return (rear==maxSize-1);
}
public static void main(String[]args){
    QueueEX myQue = new QueueEX(5);
    if(!myQue.isFull()){
        myQue.enque(10);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
        if(!myQue.isFull()){
        myQue.enque(20);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
        if(!myQue.isFull()){
        myQue.enque(30);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
        if(!myQue.isFull()){
        myQue.enque(40);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
        if(!myQue.isFull()){
        myQue.enque(50);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
        if(!myQue.isFull()){
        myQue.enque(60);
    }
    else{
        System.out.println("No spaces in rear to insert");
    }
}
}