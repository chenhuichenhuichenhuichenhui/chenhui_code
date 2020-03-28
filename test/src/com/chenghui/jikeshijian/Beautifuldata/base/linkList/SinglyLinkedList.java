package com.chenghui.jikeshijian.Beautifuldata.base.linkList;

/**
 * 单链表的插入、删除、查找操作
 * 链表中存储的int类型的数据
 */
public class SinglyLinkedList {
    private Node head=null;

    public Node findByValue(int value){
        Node p  = head;
        while(p!=null && p.data!=value){
            p = p.next;
        }
        return p;
    }

    public Node findByIndex(int index){
        Node p = head;
        int i = 0;
        while(p!=null && i!=index){
            p = p.next;
            i++;
        }
        return p;
    }
    //无头节点
    //表头部插入
    //这种操作将于操作的顺序相反，逆序
    public void insertToHead(int value) {
        Node newNode = new Node(value,null);
        insertToHead(newNode);
    }

    public void insertToHead(Node newNode){
        if(head == null ){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    //顺序插入
    //链表尾部插入
    public void insertTail(int value){
        Node newNode = new Node(value,null);
        insertTail(newNode);
    }
    public void insertTail(Node newNode){
        Node p = head;
        if(p==null){
            head = newNode;
        }else {
            while (p.next != null) {
                p = p.next;
            }
            newNode.next = p.next;//有可能newNode的next不为null
            p.next = newNode;
        }
    }
    public void insertAfter(Node p ,int value){
        Node newNode = new Node(value,null);
        insertAfter(p,newNode);
    }
    public void insertAfter(Node p, Node newNode){
        if(p==null){
            return;
        }
        newNode.next = p.next;
        p.next = newNode;
    }
    public void insertBefore(Node p ,int value){
        Node newNode = new Node(value,null);
        insertBefore(p,newNode);
    }
    public void insertBefore(Node p,Node newNode){
        if(p==null)return;
        if(head == p){
            insertToHead(newNode);
            return;
        }
        Node q = head;
        while(q!=null && q.next!=p){
            q = q.next ;
        }

        if(q == null){return;}

        newNode.next = p;
        q.next = newNode;

    }

    public void deleteByNode(Node p ){
        if(head==null || p==null){return;}
        if(p == head){
            head =head.next;
        }
        Node q = head;
        while(q != null && q.next != p){
            q = q.next;
        }
        if(q==null)return;
        q.next = q.next.next;

    }

    public void deleteByValue(int value){
        if(head ==null){return;}

        Node p = head;
        Node pre = null;
        while(p!=null && p.data != value){
            pre = p;
            p = p.next;
        }
        if(p==null){
            return;
        }
        if(pre==null){
            head = head.next;
        }else {
            pre.next = p.next;
        }
    }

    public void printAll(){
        if(head == null){
            return;
        }
        Node p = head;
        while(p!=null){
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.println();
    }


    //判断是否为回文
    public boolean palindrome(){
        if(head == null){
            return false;
        }
        Node p = head;
        Node q = head;
        while(q.next!=null && q.next.next!=null ){
            p = p.next;
            q = q.next.next;
        }
        //判断字符串的奇偶
        //1.奇数 p为正中间的数
        if(q.next==null){
            Node right = p.next;
            Node left = inverseLinkList(p).next;
            return TFResult(left,right);

        }
        //2.偶数 p为中间靠左边的数
        if(q.next.next==null){
            Node right = p.next;
            Node left = inverseLinkList(p);
            return TFResult(left,right);
        }
        return false;

    }
    //链表反转 不带头节点的
    public Node inverseLinkList(Node p){
        Node r = head;
        Node pre = null;
        Node next = null;
        while(r!=p){
            next = r.next;

            r.next = pre;
            pre = r;
            r = next;
        }
        r.next = pre;
        return p;
    }

    //判断true or false
    public boolean TFResult(Node left,Node right){
        while(left!=null && right!=null){
            if(left.data!=right.data)return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static Node createNode(int value){
        return new Node(value,null);
    }





    public static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static void main(String[]args){

        SinglyLinkedList link = new SinglyLinkedList();
        System.out.println("hello");
        //int data[] = {1};
        //int data[] = {1,2};
        int data[] = {1,2,3,1};
        //int data[] = {1,2,5};
        //int data[] = {1,2,2,1};
        //int data[] = {1,2,5,2,1};
        // int data[] = {1,2,5,3,1};

        for(int i =0; i < data.length; i++){
            //link.insertToHead(data[i]);
            link.insertTail(data[i]);
        }
        // link.printAll();
        // Node p = link.inverseLinkList_head(link.head);
        // while(p != null){
        //     System.out.println("aa"+p.data);
        //     p = p.next;
        // }

        System.out.println("打印原始:");
        link.printAll();
        if (link.palindrome()){
            System.out.println("回文");
        }else{
            System.out.println("不是回文");
        }
    }


}
