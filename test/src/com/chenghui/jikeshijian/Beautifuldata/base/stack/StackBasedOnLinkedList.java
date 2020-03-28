package com.chenghui.jikeshijian.Beautifuldata.base.stack;

/**
 * 基于链表实现的栈
 */
public class StackBasedOnLinkedList {
    private Node top = null;

    //入栈
    public void push(int value){
        Node newNode = new Node(value,null);
        //判断是否为栈空
        if(top==null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }

    }

    public void printAll(){
        if(top==null){return;}
        Node p = top;
        while(p!=null){
            System.out.println(p.value+" ");
            p = p.next;
        }
        System.out.println();
    }

    //用-1表示栈中没有元素
    public int pop(){
        if(top==null){return -1;}
        Node p = top;
        top = top.next;
        return p.value;
    }

    private static class Node{
        private int value;
        private Node next;

        public Node(int value ,Node next){
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }
}
