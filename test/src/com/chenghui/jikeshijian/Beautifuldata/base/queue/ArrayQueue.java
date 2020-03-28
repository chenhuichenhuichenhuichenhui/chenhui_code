package com.chenghui.jikeshijian.Beautifuldata.base.queue;

/**
 * 用数组实现的队列
 */
public class ArrayQueue {
    //数组：items,数组大小n
    private String[] items;
    private int n = 0;

    //头指针
    private int head = 0;
    private int tail = 0;

    //申请一个大小为capacity的数组
    public ArrayQueue(int capacity){
        items = new String[capacity];
        n = capacity;
    }

    //入队
    public boolean enqueue(String item){
        //如果tail = n 表示队列已经满了
        if(tail == n) return false;
        items[tail] = item;
        tail++;
        return true;
    }

    //出队
    public String dequene(){
        if(head == tail)return null;
        return items[head++];
    }
    public void printAll(){
        for(int i = head;i<tail;i++){
            System.out.println(items[i]+" ");
        }
        System.out.println();
    }


}
