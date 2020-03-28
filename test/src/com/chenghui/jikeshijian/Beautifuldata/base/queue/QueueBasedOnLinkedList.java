package com.chenghui.jikeshijian.Beautifuldata.base.queue;

/**
 * 基于链表实现的队列
 */
public class QueueBasedOnLinkedList {
    //队头
    private Node head = null;
    //队尾
    private Node tail = null;

    //入队
    public void enqueue(String value){
        Node newNode = new Node(value,null);
        if(tail==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    //出队
    public String dequeue(){
        if(head == null){return null;}
        String value = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        return value;
    }

    //打印所有
    public void printAll(){
        Node p = head;
      //  if(p==null)return; 这一行底下的代码已经可以涵盖 不要也行
        while(p!=null){
            System.out.println(p.value+" ");
            p = p.next;
        }
        System.out.println();
    }

    private static class Node{
        private String value;
        private Node next;
        public Node(String value,Node next){
            this.value = value;
            this.next = next;
        }
        public String getValue(){
            return this.value;
        }
    }
}

