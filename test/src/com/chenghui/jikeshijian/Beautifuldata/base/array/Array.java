package com.chenghui.jikeshijian.Beautifuldata.base.array;

/**
 * 数组得插入、删除、按照下标随机访问操作；
 *数组中得数据类型是int类型
 */
public class Array {
    //定义整型数据data保存数据
    public int data[];
    //定义数组长度
    private int n;
    //定义数组中实际个数
    private int count;

    //构造方法，定义数组得大小
    public Array(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    //根据索引，找到数据中的元素并返回
    public int find(int index){
        if(index<0 || index>=count){
            return -1;
        }
        return data[index];
    }
    //插入元素:头部插入，尾部插入
    public boolean insert(int index,int value){
        //数组已满
        if(count==n){
            System.out.println("数组已满，不能再插入数据");
            return false;
        }
        //插入位置不合法
        if(index<0 || index>count){  //只能连续插入数据
            System.out.println("数据的插入位置不合法");
            return false;
        }
        //插入位置合法
        for(int i = count;i>index;--i){
            data[i]=data[i-1];
        }
        data[index] = value;
        count++;
        return true;
    }
    //根据索引，删除数组中元素
    public boolean delete(int index){
        //若数组中没有元素
        if(count == 0){
            System.out.println("数组中没有该元素");
            return false;
        }
        //删除的索引是非法的
        if(index<0 || index>=count){
            System.out.println("非法索引");
            return false;
        }
        //
        for(int i = index;i<count;++i){
            data[i] = data[i+1];
        }
        count--;
        return true;

    }
    public void printAll(){
        for (int i = 0;i<count;i++){
            System.out.print(data[i]+"  ");
        }
    }
    public static void main(String[] args) {
        Array array = new Array(5);
        array.printAll();
        array.insert(0, 3);
        array.insert(0, 4);
        array.insert(1, 5);
        array.insert(3, 9);
        array.insert(3, 10);
        //array.insert(3, 11);
        array.printAll();
    }


}
