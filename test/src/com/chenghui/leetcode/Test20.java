package com.chenghui.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test20 {
    private static Map<Character,Character> MapCash;
    static {
        MapCash = new HashMap<>();
        MapCash.put(')','(');
        MapCash.put(']','[');
        MapCash.put('}','{');

    }

    public static boolean isValid(String s) {
        LinkedStack<Character> stack = new LinkedStack();
        if(s==null || " ".equals(s)){return true;}

        for(int i = 0 ;i<s.length();i++ ){
            Character c = s.charAt(i);
            if(MapCash.containsKey(c)){
                Character topElement = stack.isEmpty() ?  '#': stack.pop();
                if (!topElement.equals(MapCash.get(c))) {
                    return false;
                }
            }else{
                stack.push(c);
            }
            }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "()";
        boolean b = isValid(s);
        System.out.println(b);
    }





    public static class LinkedStack<T>{

        //栈的顶部节点
        private Node top = null;

        //入栈
        public void push(T value){
            Node newNode = new Node(value,null);
            if(top==null){
                top = newNode;
            }else {
                newNode.next = top;
                top = newNode;
            }
        }

        //出栈
        public T pop(){
            if(top==null){
                System.out.println("栈为空");
                return null;
            }
            T data = (T) top.value;
            top = top.next;
            return data;
        }
        //栈是否为空
        public boolean isEmpty(){
            if(top==null){
                return true;
            }
            return false;
        }
        //栈头节点的数据
        public T getTopData(){
            if(top==null){return null;}
            return (T) top.value;
        }

        public static class Node<T>{
               private T value;
               private Node next;

               public Node(T value,Node next){
                   this.value = value;
                   this.next = next;
               }

               public T getValue() {
                   return value;
               }
        }
    }
}
