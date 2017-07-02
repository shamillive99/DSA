/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buwaneka De Silva
 */
public class Stack {
    private int maxSize;
    private double stackArray[];
    private int top;


public Stack(int s){
    maxSize=s;
    stackArray = new double [maxSize];
    top=-1;
}

public void push(double j){
    stackArray[++top]=j;
}

public double pop(){
    return stackArray[top--];
}

public double peek(){
    return stackArray[top];
}

public boolean isEmpty(){
    return (top==-1);
}

public boolean isfull(){
    return (top==maxSize-1);
}
public static void main(String[]args){
Stack ob = new Stack(6);
if(!ob.isfull()){
    ob.push(10);
}
if(!ob.isfull()){
    ob.push(30);
}
if(!ob.isfull()){
    ob.push(15);
}
if(!ob.isEmpty()){
    ob.pop();
}
double topElement = ob.peek();
    System.out.println(topElement);
}
}

