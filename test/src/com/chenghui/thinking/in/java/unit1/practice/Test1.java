package com.chenghui.thinking.in.java.unit1.practice;

import com.chenghui.suanfa.Person;

public class Test1 {
    public static void main(String[] args) {
        Boolean b = false;
        int i ;
        char a ;
       Person p = new Person();
       p.setDr(true);
        System.out.println("dr:::"+p.getDr());
        System.out.println("================================");
        System.out.println(p.getDr().equals(false));
        System.out.println("-------------------------------------");
       if(p.getDr().compareTo(false)==0){
           System.out.println("false");
       }else if (p.getDr().compareTo(true)==0){
           System.out.println("true");
       }else{
           System.out.println("no");

       }
    }
}
