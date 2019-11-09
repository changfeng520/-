package cn.ghh.basic;

import java.util.Scanner;

//这个类用来测试圆的面积
public class Test2_Area {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        double r = new Scanner(System.in).nextDouble();
        double res=r*r*3.14;
        System.out.println(res);
    }


}
