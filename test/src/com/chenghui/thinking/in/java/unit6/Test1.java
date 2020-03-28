package com.chenghui.thinking.in.java.unit6;

import com.chenghui.thinking.in.java.unit6.test8.Connection;
import com.chenghui.thinking.in.java.unit6.test8.Connectionmanager;

import static com.chenghui.thinking.in.java.unit6.DebugOff.TestDebug.*;

 class Test1 {
    public static void main(String[] args) {
        Connectionmanager s = new Connectionmanager();
        for(int i = 0 ;i<4;i++){
            Connection connection = s.makeConnection();
            if(connection!=null){
                System.out.println(connection.f());
            }else{
                System.out.println("资源耗尽");
            }

        }


        print("nininini");
    }
}
