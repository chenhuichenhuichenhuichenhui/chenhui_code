package com.chenghui.thinking.in.java.unit5;

import java.util.Arrays;

public class Test19 {
    static void f(String... args){
        for(String s:args){
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f("hello","boys","girls");
        f(new String[]{"你好","男孩们","女孩们"});
        System.out.println(Arrays.toString(args));
    }
}
