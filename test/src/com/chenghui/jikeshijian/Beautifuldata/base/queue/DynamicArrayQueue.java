package com.chenghui.jikeshijian.Beautifuldata.base.queue;


public class DynamicArrayQueue {
    //数组：items,数组大小：n
    private String[] items;
    private int n;

    //头指针尾指针
    private int head =0;
    private int tail = 0;

    //申请一个大小为capacity的数组
    public DynamicArrayQueue(int capacity){
        items = new String[capacity];
        n = capacity;
    }

    //入队操作，将item放入队尾
    public boolean enqueue(String item){
        //tail == n 表示队列末尾没有空间了
        if(tail == n){
            //tail == n && head==0,表示整个队列都占满了
            if(head == 0)return false;
            //数据搬移
            for (int i = head;i<tail;i++){
                items[i-head] = items[i];
            }
            head = 0;
            tail = tail-head;//tail的值本身就比最大索引大1
        }
        items[tail++] = item;
        return true;

    }
    //出队
    public String pop(){
        //队空
        if(head==tail)return null;
        return items[head++];
    }

    public void printAll(){
        if(head == tail)return;
        for(int i = head;i<tail;i++){
            System.out.println(items[i]);
        }
        System.out.println();
    }

}
