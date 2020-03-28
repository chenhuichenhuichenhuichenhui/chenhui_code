package com.chenghui.jikeshijian.Beautifuldata.base.array;

/**
 * 1）数组的插入、删除、按照下标随机访问操作；
 * 2）数组中的数据是int类型的；
 */
public class Array_ {
    //定义整型数据data保存数据
    public int[] data;
    //定义数组长度
    private int n;
    //定义数组中实际存数据的个数
    private int count;

    //构造方法，定义数组的大小
    public Array_(int n){
        this.data = new int[n];
        this.n = n;
        this.count = 0;
    }
    //根据索引，找到数据中的元素并返回
    public int find(int index){
        if(index>=count || index<0){
            System.out.println("索引不合法");
            return 0;
        }
        return data[index];
    }
    //插入元素 头部插入，尾部插入
    public boolean insert(int data){
        if(n==count){
            System.out.println("数组已满，无法插入数据");
            return false;
        }
        //===================尾部插入
        // this.data[count++] =data;
        // return true;
        //=======================头部插入
        for(int i = count;i>0;--i){
            this.data[i] =this.data[i-1];
        }
        this.data[0] = data;
        count++;
        return true;
    }

    public boolean insert(int index,int value){
        //数组已满
        if(n==count){
            System.out.println("数组已满，无法插入数据");
            return false;
        }
        //数组未满 索引不合法
        if(index<0||index>count){
            System.out.println("索引不合法");
            return false;
        }
        for(int i=count;i>index;--i){
            this.data[i] =this.data[i-1];
        }
        this.data[index] = value;
        count++;
        return true;

    }
    //根据索引删除数组中的元素
    public boolean delete(int index){
        if(index<0||index>=count){
            return false;
        }
        for(int i=index;i<count-1;++i){
            data[i] = data[i+1];
        }
        --count;
        return true;
    }



}
