package cn.ghh.basic;

import java.util.Scanner;

//接收用户输入的原价。
//
//        满1000打9折。
//
//        满2000打8折。
//
//        满5000打5折。
public class Test2_If {
    public static void main(String[] args) {
        System.out.println("请输入商品原价：");
        int t = new Scanner(System.in).nextInt();
        if(t>=0&&t<1000){
        }else if(t>=1000&&t<2000){
            t *= 0.9;
        }else if(t>=2000&&t<5000){
            t *= 0.8;
        }else if (t>=5000){
            t *= 0.5;
        }
        System.out.println("该商品折扣价为"+t);
    }
}
