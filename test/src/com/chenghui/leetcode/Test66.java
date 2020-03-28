package com.chenghui.leetcode;

public class Test66 {
    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        for(int i = digits.length-1;i<=0;i++){
            //if(digits[i]+1)%10

        }
        System.out.println(sb+"=======0000000000000000000");
        Integer num = Integer.valueOf(sb.toString())+1;

        char[] cnum  = num.toString().toCharArray();
        int[] res = new int[cnum.length];
        for(int i = 0;i<cnum.length;i++){
            res[i] = cnum[i];
            System.out.println(res[i]+"=======0000000000000000000");
        }

        return res;

    }
    public static void main (String[] args){
        String shopIds = "ss";
        String[] shopIdArry= shopIds.split(",");
        for(String s:shopIdArry){
            System.out.println(s);
        }
    }
}
