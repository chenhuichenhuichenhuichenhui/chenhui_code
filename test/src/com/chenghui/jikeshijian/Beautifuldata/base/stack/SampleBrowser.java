package com.chenghui.jikeshijian.Beautifuldata.base.stack;

/**
 * 使用前后栈实现浏览器的前进后退
 */
public class SampleBrowser {
    private String cuurentPage;
    private LinkedListBasedStack backStack;
    private LinkedListBasedStack forwardStack;

    public SampleBrowser(){
        this.backStack = new LinkedListBasedStack();
        this.forwardStack = new LinkedListBasedStack();
    }

    public void open(String url){
        if(this.cuurentPage != null){
            this.backStack.push(cuurentPage);
            this.forwardStack.clear();
        }
        showUrl(url,"open");
    }

    public boolean canGoBack(){
        return this.backStack.size>0;
    }

    public boolean canGoForward(){
        return this.forwardStack.size>0;
    }

    public String goBack(){
        if(canGoBack()){
            this.forwardStack.push(cuurentPage);
            String backUrl = this.backStack.pop();
            showUrl(backUrl,"Back");
            return backUrl;
        }
        System.out.println("*Cannot go back, no pages behind");
        return null;
    }
    public String goForward(){
        if(canGoForward()){
            this.backStack.push(cuurentPage);
            String forwardUrl = this.forwardStack.pop();
            showUrl(forwardUrl,"Forward");
            return forwardUrl;
        }
        System.out.println("*Cannot go forward, no pages ahead");
        return null;
    }

    public void showUrl(String url,String prefix){
        this.cuurentPage = url;
        System.out.println(prefix + " page== "+url);
    }

    public void checkCurrentPage(){
        System.out.println("Current oage is: "+this.cuurentPage);
    }

    private static class LinkedListBasedStack{
        private int size;
        private Node top;

        static Node createdNode(String data,Node next){
            return new Node(data,next);
        }

        public void clear(){
            this.top = null;
            size = 0;
        }

        //入栈
        public void push(String data){
            Node newNode = createdNode(data,top);
            top = newNode;
            size++;
        }
        //出栈
        public String pop(){
            Node popNode = this.top;
            if(popNode==null){
                System.out.println("Stack is emty.");
                return null;
            }
            this.top = popNode.next;
            if(this.size>0) {
                size--;
            }
            return popNode.data;
        }
        public String getTopData(){
            if(this.top==null){return null;}
            return top.data;
        }
        public int size(){return this.size;}

        public void print(){
            System.out.println("Print stack");
            if(top==null){return;}
            Node p = top;
            while(p!=null){
                System.out.print(p.data+" ");
                p = p.next;
            }
            System.out.println();
        }


        private static class Node{
            private String data;
            private Node next;

            public Node(String data){
                this(data,null);
            }

            public Node(String data, Node next) {
                this.data = data;
                this.next = next;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }
        }
    }
}
