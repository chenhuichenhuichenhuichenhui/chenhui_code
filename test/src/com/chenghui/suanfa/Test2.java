package com.chenghui.suanfa;

import java.math.BigDecimal;

public class Test2 {
    public static void main(String[] args) {
       BigDecimal a = new BigDecimal(0.1234567891233333333333333333);
        System.out.println(a.doubleValue());
        System.out.println(a.toString());
        System.out.println(a.toPlainString());
        System.out.println(Math.round(a.doubleValue()));
    }
}
