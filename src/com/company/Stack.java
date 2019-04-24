package com.company;

public class Stack<E> {
    private E[] arr = null;
    private int CAP;
    private int top = -1;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public Stack (int cap){
        this.CAP = cap;
        this.arr = (E[]) new Object[cap];
    }

    public E pop(){
        if (this.size == 0){
            return null;
        }
        this.size--;
        E result = this.arr[top];
        //Prevent memory leak
        this.arr[top] = null;
        this.top--;

        return result;
    }

    public  boolean push(E e){
        if (isFull()){
            return false;
        }
        this.size++;
        this.arr[++top] = e;
        return true;
    }
     public boolean isFull(){
        if (this.size == this.CAP){
            return true;
        }
        return false;
    }

    public E peek(){
        E result = this.arr[top];
        return result;
    }
    @Override
    public String toString(){
        if(this.size == 0)
            return null;

        StringBuilder builder = new StringBuilder();
        for (int i=0; i <this.size; i++){
            builder.append(this.arr[i]+",");
        }
        builder.setLength(builder.length() -1);
        return builder.toString();
    }

}
