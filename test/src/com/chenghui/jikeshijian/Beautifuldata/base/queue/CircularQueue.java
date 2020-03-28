package com.chenghui.jikeshijian.Beautifuldata.base.queue;

/**
 * 用数组实现循环队列
 */
public class CircularQueue {
    //循环数组 数组大小：n
    private String[] items;
    private int n = 0;

    //队头队尾指针
    private int head = 0;
    private int tail = 0;

    //申请一个大小为capacity的数组
    public CircularQueue(int capacity){
        items = new String[capacity];
        n = capacity;
    }
    //入队
    public boolean enqueue(String item){
        //队列满了
        if((tail+1)%n==head){
            return false;
        }
        items[tail] = item;
        tail = (tail+1)%n;
        return true;
    }

    //出队
    public String pop(){
        if(tail == head){
            return null;
        }
        String data  = items[head];
        head = (head+1)%n;
        return data;

    }

    public void printAll(){
        if(0==n){return;}
       // if(head == tail){return;} 下面的代码已经包含了
        for(int i = head;i%n != tail; i=(i+1)%n){
            System.out.println(items[i]+" ");
        }
        System.out.println();
    }




}
