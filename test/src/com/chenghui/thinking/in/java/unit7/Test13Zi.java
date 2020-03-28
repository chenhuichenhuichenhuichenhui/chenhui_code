package com.chenghui.thinking.in.java.unit7;

import java.util.ArrayList;
import java.util.List;

public class Test13Zi extends Test13{


    public void convse(String i){
       String a = super.s;
        System.out.println("super String convse");
    }

    //演示方法
    public void z(){
        convse(1);
    }
    public void m(){
        System.out.println("1233");
        convse(2);
    }
    public void v(){
        //注释测试
    }
    public void v2(){
        System.out.println("111");
        List<String> arr = new ArrayList();
    }
}
