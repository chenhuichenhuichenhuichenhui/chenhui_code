package com.chenghui.jikeshijian.Beautifuldata.rumen;

/**
 * 大O时间复杂度实际上并不表示代码真正得执行时间，而是表示代码执行时间随数据规模增长的变化趋势
 * 当n很大时 低阶 系数 常量 并不左右数据规模增长得变化趋势
 */
public class Task3 {
    //test1
   int cal(int n){
       int sum = 0;   //1
       int i = 1;     //1
       for(;i<=n;++i){     //n
           sum = sum + i;   //n
       }
       return sum;
   }
   //时间复杂度分析：(2n+2)unit_time  ~~~O(n)

    //test2
    int cal2(int n){
       int sum = 0;   //1
       int i = 1;     //1
       int j = 1;        //1
       for(; i<=n;++j){   //n
           j = 1;          //1
           for(;j<=n;++j){   //n
               sum = sum + i*j; //n
           }
       }
        return sum;
    }
    //时间复杂度分析： (3+(n+1)*2n)*unit_time   ~~~(n平方)





}
