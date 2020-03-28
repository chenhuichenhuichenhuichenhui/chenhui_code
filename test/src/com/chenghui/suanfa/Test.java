package com.chenghui.suanfa;


import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {
    private final static String INFO ="%s同学收到%s元钱。";
    private BigDecimal depositPercent;

    public BigDecimal getDepositPercent() {
        return depositPercent;
    }

    public void setDepositPercent(BigDecimal depositPercent) {
        this.depositPercent = depositPercent;
    }

    public Integer compure(int a, int b){
        int c = (a+b)*10;
        return c;
    }
    public static List<Person> makeList(){
        List<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.setName("hahh");
        p1.setAge(1);
        Person p2 = new Person();
        p2.setName("dd");
        p2.setAge(2);
        Person p3 = new Person();
        p3.setName("aa");
        p3.setAge(3);
        Person p4 = new Person();
        p4.setName("gg");
        p4.setAge(4);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        return list;

    }
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        Integer c = 128; //-126-127之间有缓存
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);

    }
    public static Double squareRoot(int a){
        double x = 0;
        double low = 0;
        double high = a;
        while(low<=high){
             x = (low+high)/2;
             if(x*x>a){
                 high = x-0.000001;
             }
             if(x*x<a){
                 low = x+0.000001;
             }
        }
        return new BigDecimal(x).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static void bianli(List<Integer> list){
        for (Integer str:list) {
            System.out.println(str);
        }
    }
    public static void bianli(Map<String,Integer> map){
        for (String str:map.keySet()) {
            System.out.println(str+ "  "+map.get(str));
        }
    }

    private static Boolean checkReturnValue(Integer value){
        String pattern = "\\d{1,6}";
        return Pattern.matches(pattern, value+"");
    }
}
