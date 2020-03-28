package com.chenghui.jikeshijian.Beautifuldata.base.linkList;


/**
 * 1)单链表的反转
 * 2）链表中环的检测
 * 3)两个有序的链表合并
 * 4）删除链表倒数第n个结点
 * 5）求链表的中间节点
 */
public class LinkedListAlgo {

    //单链表反转
    public static Node reverse(Node head){
        Node p  = head;
        Node pre = null;
        while(p!=null){
            Node next = p.next;

            p.next = pre;
            pre = p;
            p = next;
        }
        return pre;
    }
    //检测环
    public static boolean checkCircle(Node head){
        if(head == null){return false;}

        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){return true;}
        }
        return false;
    }
    //有序链表的合并
    public static Node mergeSortedList(Node la,Node lb){
        if(la==null){return lb;}
        if(lb==null){return la;}
        Node p = la;
        Node q = lb;
        Node head;
        if(p.data<q.data){
            head = p;
            p=p.next;
        }else{
            head = q;
            q=q.next;
        }
        Node r = head;
        while(p!=null && q!=null){
            if(p.data<q.data){
                r.next = p;
                p = p.next;
            }else{
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }
        if(p!=null){
            r.next = p;
        }else{
            r.next = q;
        }
        return head;

    }

    //有序链表合并 leetcode 21
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode soldier = new ListNode(0);//利用哨兵机制简化实现难度 技巧三
        ListNode p = soldier;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if(l1!=null){p.next = l1;}
        if(l2!=null){p.next = l2;}
        return soldier.next;

    }
    //删除倒数第K个节点
    public static Node deleteLastKth(Node head,int k){
        //自己的想法：链表反转  然后再删除第k个元素  但是链表的结构被改变了
      Node fast = head;
      int i = 1;
      while(fast!=null && i<k){
          fast = fast.next;
          i++;
      }
      if(fast==null){
          return head;
      }
      Node slow = head;
      Node pre=null;
      while(fast.next!=null){
        fast = fast.next;
        pre = slow;
        slow = slow.next;
      }

      if(pre==null){
          head = head.next;
      }else{
          pre.next = pre.next.next;
      }

        return head;


    }


    //求中间节点
    public static Node findMiddleNode(Node head){
        if(head==null){return head;}
        Node p = head;
        Node q = head;
        while(q.next!=null && q.next.next!=null){
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
    public static void printAll(Node head){
        //if(head == null ){return;}  下面的代码已经可以兼容
        Node p = head;
        while(p!=null){
            System.out.println(p.data+" ");
            p = p.next;
        }
        System.out.println();
    }



    public static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        public int getData(){
            return data;
        }
    }

}
