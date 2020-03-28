package com.chenghui.thinking.in.java.unit5;

public class Book {
    Boolean checkedOut = false;
    Book(boolean checkOut){
        this.checkedOut = checkOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize() throws Throwable {
        if(checkedOut){
            System.out.println("Error: checkout out");
            //super.finalize();
        }
        System.out.println("wa");
    }

}
