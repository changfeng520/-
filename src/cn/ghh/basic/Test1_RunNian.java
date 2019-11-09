package cn.ghh.basic;

import java.util.Scanner;

//输入年号，判断是否是闰年。两个条件：
//
//        1、能被4整除，并且不能被100整除
//
//        2、能被400整除
public class Test1_RunNian {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        String desc = "平年";
        if ((t%4==0&&t%100!=0)||t%400==0){
            desc = "闰年";
        }
        System.out.println(desc);
    }
}
