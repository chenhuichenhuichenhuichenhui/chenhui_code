package com.chenghui.jikeshijian.Beautifuldata.base.stack;

public class StackBasedOnArray {
    private String[] items;
    private Integer n; //栈的大小
    private Integer count;//栈中存储数的个数

    //初始化数组，申请一个大小为n的数组空间
    public StackBasedOnArray(int n){
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }
    //入栈操作
    public boolean push(String item){
        if(count == n){return false;}
        items[count] = item;
        count++;
        return true;
    }
    //出栈操作
    public String pop(){
        if(count==0){return null;}
        return items[--count];

    }


}
